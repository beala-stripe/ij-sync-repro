
load(
    "@io_bazel_rules_scala//scala_proto:scala_proto_toolchain.bzl",
    "scala_proto_toolchain",
)

scala_proto_toolchain(
    name = "test_scala_proto_toolchain_configuration",
    visibility = ["//visibility:public"],
    with_flat_package = True,
    with_grpc = True,
)

toolchain(
    name = "scalapb_toolchain",
    toolchain = ":test_scala_proto_toolchain_configuration",
    toolchain_type = "@io_bazel_rules_scala//scala_proto:toolchain_type",
    visibility = ["//visibility:public"],
)