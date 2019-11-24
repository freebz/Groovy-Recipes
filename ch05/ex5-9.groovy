// 5.7 Waiting for a Shell Command to Finish Before Continuing

def p = "convert -crop 256x256 full.jpg tile.jpg".execute()
p.waitFor()
println "ls".execute().text
