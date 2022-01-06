String command ="""
pwd
ls
\$env:USERNAME
hostname
python --version
"""
def p = ["pwsh.exe", "-c", command ].execute()
p.waitFor()
println p.text
