# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Messages used by nodes in the people stack."
AUTHOR = "Dan Lazewatsky <dan@lazewatsky.com>"
ROS_AUTHOR = "Caroline Pantofaru"
HOMEPAGE = "http://ros.org/wiki/people_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "people"
ROS_BPN = "people_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    rosidl-default-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/OSUrobotics/people-ros2-release/archive/release/dashing/people_msgs/1.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/people_msgs"
SRC_URI = "git://github.com/OSUrobotics/people-ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "c84ad6de48d412840cc89c601b1b0079b66bb914"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
