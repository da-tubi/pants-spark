# Scala Hello World using Pants
## Step 1: Init Pants 2.12.0
1. Install Pants 2.12.0 via command line provided by https://www.pantsbuild.org/docs/installation.
2. Add `.gitignore` manually.

## Step 2: Hello World Source Code and Build Definition
1. Add source code: `Main.scala`
2. Generate build definition by `./pants tailor`
3. For other changes, we'd better copy and paste from the official example repo
   - `3rdparty/jvm/org/scala-lang/BUILD.pants`
   - `pants.toml`

```commandline
# To generate 3rdparty/jvm/default.lock
./pants generate-lockfiles --resolve=jvm-default 

./pants fmt src/jvm::

./pants lint ::

./pants check ::
```

## Step 3: Add `deploy_jar` filter
```commandline
./pants run hello/src:bin
```