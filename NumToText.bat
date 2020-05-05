del *.class
set PATH=C:\Program Files (x86)\AdoptOpenJDK\jdk-13.0.2.8-hotspot/bin;%PATH%
javac.exe -encoding utf8 %~n0.java
java.exe -Dfile.encoding=CP866 %~n0
pause