# Demonstrate Git Proficiency

## Tasks:
* Install and configure Git on your local development machine

* Initialize a new repository

* Add a file and commit it to the repository

* Modify that file and commit it to the repository again

* Squash the two commits into one commit
* Create a branch

* Modify a file on the branch and commit it

* Merge the branch back into the master branch

* Delete the branch you just merged into master.
* Add a remote origin to the repository


# Steps to Complete
## initialize a new repo
* mkdir test-repo
* cd test-repo
* git init
## create a new file and add to git
* touch example.txt
* git add example.txt
* git commit -m "init commit"
## modify file and commit to repo
* nano example.txt
* **edit the file**
* git add example.txt
* git commit -m "second change"
* nano example.txt
* **edit the file**
* git add example.txt
* git commit -m "second change"
## squash commits
* git rebase -i 93448445bb96a42138a9b2d744fbcb834db60344
* inside the editor, change the second *pick* to *s* and exit editor
## create new branch
* git checkout -b practicebranch
## Modify on the branch and commit file
* nano example.txt
* **edit the file**
* git add example.txt
* git commit -m "edited text file in new branch"
## merge branch into master
* git checkout master
* git merge practicebranch
* git branch -d practicebranch
## delete branch now merged
* git remote add origin https://github.com/connor-prinster/test-repo.git
# add remote origin to repo
* git push -u origin master

