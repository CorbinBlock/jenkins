String shell_name = "/bin/bash"

String option_name = "-c"

String shell_command ="""
python --version
java --version
groovy --version

"""

String shell_script ="""
${shell_name} ${option_name} ${shell_command}
"""

shell_script.execute().text
