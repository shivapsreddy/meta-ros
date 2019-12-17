# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Package enabling a robot to speak with a human voice by providing a Text-To-Speech ROS service"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "tts"
ROS_BPN = "tts"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gstreamer1.0-alsa} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gstreamer1.0-plugins-good} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gstreamer1.0} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-gst-1.0} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python3-boto3} \
    launch \
    launch-ros \
    rclpy \
    std-msgs \
    tts-interfaces \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-pep257 \
    launch \
    launch-testing \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/aws-gbp/tts-release/archive/release/dashing/tts/2.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/tts"
SRC_URI = "git://github.com/aws-gbp/tts-release;${ROS_BRANCH};protocol=https"
SRCREV = "dfa59b063ac75d7d1d40c802c1cf3dd3a0253251"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
