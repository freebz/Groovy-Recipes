// stats.groovy
html.h1("Disk Free (df -h)")
html.pre('df -h'.execute().text)
html.hr()
html.h1("IP Config (ifconfig)")
html.pre('ifconfig'.execute().text)
html.hr()
html.h1("Top (top -l 1)")
html.pre('top -l 1'.execute().text)
