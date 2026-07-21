@echo off
setlocal

if "%~1"=="" (
    call "%~dp0gradlew.bat" spiderJar --no-daemon
) else (
    call "%~dp0gradlew.bat" spiderJar "-PspiderOutput=%~f1" --no-daemon
)

exit /b %errorlevel%
