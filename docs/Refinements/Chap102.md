# [CHAP-102] Automating conventional commit validation

The aim of this task is to validate the confirmation message before it takes effect and to keep the commits consistent with the tasks.

- This validation will check whether the conventional commit exists;
```bash
if ! grep -w "build:\|chore:\|ci:\|docs:\|feat:\|fix:\|perf:\|refactor:\|revert:\|test:" "$1"; then
    echo "ERROR! Commit message does not contain any conventional type., e.g. feat:, fix:." >&2
    exit 1
fi
```

- This validation will check whether the task number exists;
```bash
if ! grep -iqE "(\[CHAP-[0-9]+\]|merge)" "$1"; then
    echo "ERROR! Commit message should follow the pattern [CHAP-123], where 123 is the task number." >&2
    exit 1
fi
```

## Install hooks

- Install git hooks by executing the following command in the project root folder.

```bash
make -f Makefile
```

## Below are all the references I used:

* [Makefile Tutorial](https://makefiletutorial.com/#phony);
* [Customizing Git - An Example Git-Enforced Policy](https://git-scm.com/book/en/v2/Customizing-Git-An-Example-Git-Enforced-Policy);
* [Red Hat - Git hooks and remote Git repository integration](https://access.redhat.com/documentation/en-us/red_hat_decision_manager/7.8/html/configuring_business_central_settings_and_properties/managing-business-central-git-hooks-con);
* [commitlint - It is specific to node and other javascript projects](https://github.com/conventional-changelog/commitlint/blob/master/README.md);