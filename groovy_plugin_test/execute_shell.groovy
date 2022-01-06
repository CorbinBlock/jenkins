String shell_name = "/bin/bash"

String option_name = "-c"

String shell_command ="""
ls -ltr
"""

String shell_script ="""
${shell_name} ${option_name} ${shell_command}
"""

def p = shell_script.execute()
p.waitFor()
print(p.text)
