@echo off
java -Xmx800m -XX:PermSize=256m -cp "..\runtime\lbPatch.jar;..\runtime\lbRuntime.jar" org.lexevs.dao.index.operation.tools.OptimizeLuceneIndexLauncher %*