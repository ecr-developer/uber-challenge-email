#!/usr/bin/env bash
cp hooks/commit-msg.sh .git/hooks/commit-msg

rm -f .git/hooks/commit-msg.sample

chmod +x .git/hooks/commit-msg