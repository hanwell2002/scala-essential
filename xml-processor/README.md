
#!/bin/bash
exec scala -classpath ".;.\scala-csv_2.13-1.3.10.jar;.\scala-xml_2.13-2.1.0.jar;.\checker-qual-3.5.0.jar;.\scala-library-2.13.10.jar;.\xml-processor.jar" xml.Main "$0" "$@"
!#\                                           

scala -classpath "*.jar" xml.Main