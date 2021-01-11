import os
dirnum = 0
filenum = 0
path = 'D://github//Leetcode'
summary_path = path + "//"+ "fileList.txt"
print(path)

def filelist(sub_path):
    for filelist in os.listdir(sub_path):
        relative_path =  os.path.join(sub_path, filelist)
        with open(summary_path, 'a') as f:
            f.write("[" + relative_path + "](" + relative_path + ")" + "\n")
            f.write("\n")
            # print(relative_path)
            f.close()

f = open(summary_path, "r+")
f.truncate()
for lists in os.listdir(path):
    sub_path = os.path.join(path, lists)
    print(sub_path)
    if os.path.isfile(sub_path):
        filenum = filenum+1
    elif os.path.isdir(sub_path) and not lists.startswith(".") and not lists.startswith("image"):
        with open(summary_path, "a") as f:
            f.write("# " + lists + "\n")
            f.write("\n")
            f.close()
        filelist(lists)

 

