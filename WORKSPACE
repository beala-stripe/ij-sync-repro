rules_scala_version="ic4251fca045b3bab8ee2585e76850a8deead1fd6" # update this as needed

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

local_repository(
	name = "io_bazel_rules_scala",
	path = "../rules_scala",
)

#http_archive(
#             name = "io_bazel_rules_scala",
#             url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
#             type = "zip",
#             strip_prefix= "rules_scala-%s" % rules_scala_version
#             )

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()