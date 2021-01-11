import requests, json
import re
import os
import argparse

user_agent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.122 Safari/537.36"
session = requests.Session()
questionList = "questionList.txt"

def get_problems():
    url = "https://leetcode.com/api/problems/all/"

    headers = {'User-Agent': user_agent, 'Connection': 'keep-alive'}
    resp = session.get(url, headers=headers, timeout=10)

    question_list = json.loads(resp.content.decode('utf-8'))

    for question in question_list['stat_status_pairs']:
        # ID
        question_id = question['stat']['question_id']
        # slug
        question_slug = question['stat']['question__title_slug']

        with open("questionList.txt", 'a') as f:
            f.write(str(question_id) + ":" + question_slug + "\n")
            f.close()

        # Premium
        if question['paid_only']:
            continue


Remove = [
    "</?p>"
]
Replace = [
    ["</?code>", "``"],
    ["</?strong>", "**"],
    ["<pre>", "```\n"],
    ["</pre>", "```"],
    ["&nbsp;", " "],
    ["&quot;", '"']
]


def convert(src):
    def remove_label_in_pre(matched):
        tmp = matched.group()
        tmp = re.sub("<[^>p]*>", "", tmp)   
        return tmp
    src = re.sub("<pre>[\s\S]*?</pre>", remove_label_in_pre, src)  
    for curPattern in Remove:
        src = re.sub(curPattern, "", src)
    for curPattern, curRepl in Replace:
        src = re.sub(curPattern, curRepl, src)
    return src


def get_problem_content(id):
    print(id)
    slug = ""
    '''

    :param id: string The ID of the question to be check
    :return:　null
    '''
    f = open(questionList, 'r')
    lines = f.readlines()
    for line in lines:
        num, slug_candidate = line.split(":")
        if num == id:
            slug = slug_candidate.replace("\n", "")
            print(slug)
    if not slug:
        return

    url = "https://leetcode.com/graphql"
    params = {'operationName': "getQuestionDetail",
              'variables': {'titleSlug': slug},
              'query': '''query getQuestionDetail($titleSlug: String!) {
            question(titleSlug: $titleSlug) {
                questionId
                title
                content
            }
        }'''
    }
    json_data = json.dumps(params).encode('utf8')
    headers = {'User-Agent': user_agent, 'Connection':
               'keep-alive', 'Content-Type': 'application/json',
               'Referer': 'https://leetcode.com/problems/' + slug}
    resp = session.post(url, data=json_data, headers=headers, timeout=10)
    resp.encoding = 'utf8'
    content = resp.json()
    # 問題内容
    print(content)
    question = content['data']['question']
    fh = open('res.md', 'w', encoding='utf-8')
    # fh.writelines(question['translatedContent'])
    fh.writelines(convert(question['content']))
    fh.close()


if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument('-id','--ID',
                        nargs='+',
                        help="Please give the id with the format: -id ")

    if not os.path.getsize(questionList):
        get_problems()
    args = parser.parse_args()
    argsDict = vars(args)
    get_problem_content(argsDict.get('ID')[0])


# GraphQLは、Facebookがオープンソースとするデータクエリサービスを提供するための抽象的
# なフレームワークであるAPIのクエリ言語です。 サーバー側のAPI開発では、インターフェイス
# の定義によって返されるデータが比較的固定されていることが多いため、より多くの情報を取得
# したい場合、または情報の特定の部分のみを取得したい場合、RESTfulAPIベースのインターフェイス
# はそれほど柔軟ではありません。 また、GraphQLは、API内のデータのわかりやすく完全な説明のセット
# を提供するため、クライアントは冗長性なしに必要なデータを正確に取得できます。
# また、APIを時間の経過とともに進化させることも容易になります。 強力な開発者ツールを構築する
# ために使用されます。
