# Push the existing project to the GitHub

## Step 1 — Create a new GitHub Repo
## Step 2 — Initialize Git in the project folder
	From your terminal, run the following commands after navigating to the folder you would like to add.
## Step 3 - Initialize the Git Repo
		git init
## Add the files to the Git index
		git add .
## Commit Added Files
		git commit -m "some comments"
## Add a new remote origin
		git remote add origin git@github.com:sammy/my-new-project.git
## Push to GitHub
		git push -u -f origin main