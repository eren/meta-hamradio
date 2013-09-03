# Copyright (C) 2013 Eren Turkay <eren@hambedded.org>
#
# Released under the GPLv2 license.

DESCRIPTION = "Minimal image without a GUI that has APRS functionality"
HOMEPAGE = "http://hambedded.org/"
LICENSE = "GPLv2"

# Disable translations. This variable is used in image.bbclass. For how
# it is used, look at image.bbclass.
IMAGE_LINGUAS = " "

IMAGE_FEATURES += "ssh-server-dropbear"

IMAGE_ROOTFS_SIZE = "32768"

# Keep core-image-minimal compatibility and add related packages to the
# image
IMAGE_INSTALL = "\
packagegroup-core-boot \
hambedded-feed-configs \
ax25-tools \
ax25-apps \
aprx \
minicom \
${CORE_IMAGE_EXTRA_INSTALL} \
${ROOTFS_PKGMANAGE_BOOTSTRAP} \
"

inherit core-image
