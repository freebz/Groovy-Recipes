// 6.8 Deleting Files

// using the File method
new File("src.txt").delete()

// using the operating system
"rm src.txt".execute()

// using AntBuilder
def ant = new AntBuilder()
ant.delete(file:"src.txt")


// Delete a Directory

def ant = new AntBuilder()
ant.delete(dir:"tmp")


def ant = new AntBuilder()
ant.delete(dir:"tmp", includeemptydirs:"true")


// Deleting Selected Files from a Directory

def ant = new AntBuilder()
ant.delete{
  fileset(dir:"tmp", includes:"**/*.bak")
}
