# Demonstrate issue with JDT toolchain and rules_jvm_external

```
bazel build //... --verbose_failures
```

```
INFO: Analyzed 3 targets (0 packages loaded, 0 targets configured).
ERROR: D:/b/lfvxra2o/external/rules_jvm_external~/private/tools/java/com/github/bazelbuild/rules_jvm_external/jar/BUILD:3:12: Building external/rules_jvm_external~/private/tools/java/com/github/bazelbuild/rules_jvm_external/jar/AddJarManifestEntry.jar (1 source file) [for tool] failed: (Exit 1): java.exe failed: error executing Javac command (from target @@rules_jvm_external~//private/tools/java/com/github/bazelbuild/rules_jvm_external/jar:AddJarManifestEntry)
  cd /d D:/b/lfvxra2o/execroot/_main
  SET LC_CTYPE=en_US.UTF-8
    SET PATH=<snip>
    SET RUNFILES_MANIFEST_ONLY=1
  external\rules_java~~toolchains~remotejdk21_win\bin\java.exe --add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.resources=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED --add-opens=java.base/java.nio=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED -Dsun.io.useCanonCaches=false -XX:-CompactStrings -Xlog:disable -Xlog:all=warning:stderr:uptime,level,tags -XX:-MaxFDLimit -jar external/bazel_jdt_java_toolchain/compiler/export/JdtJavaBuilder_deploy.jar @bazel-out/x64_windows-opt-exec-ST-d57f47055a04/bin/external/rules_jvm_external~/private/tools/java/com/github/bazelbuild/rules_jvm_external/jar/AddJarManifestEntry.jar-0.params @bazel-out/x64_windows-opt-exec-ST-d57f47055a04/bin/external/rules_jvm_external~/private/tools/java/com/github/bazelbuild/rules_jvm_external/jar/AddJarManifestEntry.jar-1.params
# Configuration: d19f26ea0ff12cccee2d31a2ca3b43940d0bcfea535c8b13675a06bf88f4a5ef
# Execution platform: @@platforms//host:host
----------
1. ERROR in D:\udu\b\lfvxra2o\execroot\_main\external\rules_jvm_external~\private\tools\java\com\github\bazelbuild\rules_jvm_external\jar\AddJarManifestEntry.java (at line 6)
        import com.github.bazelbuild.rules_jvm_external.ByteStreams;
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
The import com.github.bazelbuild.rules_jvm_external.ByteStreams cannot be resolved
----------
2. ERROR in D:\udu\b\lfvxra2o\execroot\_main\external\rules_jvm_external~\private\tools\java\com\github\bazelbuild\rules_jvm_external\jar\AddJarManifestEntry.java (at line 7)
        import com.github.bazelbuild.rules_jvm_external.zip.StableZipEntry;
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
The import com.github.bazelbuild.rules_jvm_external.zip cannot be resolved
----------
3. ERROR in D:\udu\b\lfvxra2o\execroot\_main\external\rules_jvm_external~\private\tools\java\com\github\bazelbuild\rules_jvm_external\jar\AddJarManifestEntry.java (at line 191)
        ZipEntry newManifestEntry = new StableZipEntry(JarFile.MANIFEST_NAME);
                                        ^^^^^^^^^^^^^^
StableZipEntry cannot be resolved to a type
----------
4. ERROR in D:\udu\b\lfvxra2o\execroot\_main\external\rules_jvm_external~\private\tools\java\com\github\bazelbuild\rules_jvm_external\jar\AddJarManifestEntry.java (at line 211)
        ByteStreams.copy(in, zos);
        ^^^^^^^^^^^
ByteStreams cannot be resolved
----------
4 problems (4 errors)
ERROR: D:/b/lfvxra2o/external/rules_jvm_external~~maven~maven/BUILD:84:11 Creating compile jar for @@rules_jvm_external~~maven~maven//:com_google_guava_guava failed: (Exit 1): java.exe failed: error executing Javac command (from target @@rules_jvm_external~//private/tools/java/com/github/bazelbuild/rules_jvm_external/jar:AddJarManifestEntry)
  cd /d D:/b/lfvxra2o/execroot/_main
  SET LC_CTYPE=en_US.UTF-8
    SET PATH=<snip>
    SET RUNFILES_MANIFEST_ONLY=1
  external\rules_java~~toolchains~remotejdk21_win\bin\java.exe --add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.resources=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED --add-opens=java.base/java.nio=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED -Dsun.io.useCanonCaches=false -XX:-CompactStrings -Xlog:disable -Xlog:all=warning:stderr:uptime,level,tags -XX:-MaxFDLimit -jar external/bazel_jdt_java_toolchain/compiler/export/JdtJavaBuilder_deploy.jar @bazel-out/x64_windows-opt-exec-ST-d57f47055a04/bin/external/rules_jvm_external~/private/tools/java/com/github/bazelbuild/rules_jvm_external/jar/AddJarManifestEntry.jar-0.params @bazel-out/x64_windows-opt-exec-ST-d57f47055a04/bin/external/rules_jvm_external~/private/tools/java/com/github/bazelbuild/rules_jvm_external/jar/AddJarManifestEntry.jar-1.params
# Configuration: d19f26ea0ff12cccee2d31a2ca3b43940d0bcfea535c8b13675a06bf88f4a5ef
# Execution platform: @@platforms//host:host
INFO: Elapsed time: 1.071s, Critical Path: 0.08s
INFO: 10 processes: 10 internal.
ERROR: Build did NOT complete successfully
```