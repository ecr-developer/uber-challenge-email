#!/usr/bin/env bash

### "build"|"chore"|"ci"|"docs"|"feat"|"fix"|"perf"|"refactor"|"revert"|"test"

shopt -s nocasematch # Enable case-insensitive matching

if ! grep -w "build:\|chore:\|ci:\|docs:\|feat:\|fix:\|perf:\|refactor:\|revert:\|test:" "$1"; then
    echo "ERROR! Commit message does not contain any conventional type., e.g. feat:, fix:." >&2
    exit 1
fi

if ! grep -iqE "(\[CHAP-[0-9]+\]|merge)" "$1"; then
    echo "ERROR! Commit message should follow the pattern [CHAP-123], where 123 is the task number." >&2
    exit 1
fi

exit 0
