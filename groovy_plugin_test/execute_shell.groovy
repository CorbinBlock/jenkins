String command = "ls; pwd; id; hostname"
def p = ["/bin/bash", "-c", command ].execute()
p.waitFor()
println p.text
