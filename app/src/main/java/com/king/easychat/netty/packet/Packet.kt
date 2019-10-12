package com.king.easychat.netty.packet

import com.king.base.util.TimeUtils

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
abstract class Packet {

    var version = 1

    var dateTime = TimeUtils.formatDate(System.currentTimeMillis(),TimeUtils.FORMAT_Y_TO_S)

    abstract fun packetType(): Int


    override fun toString(): String {
        return "Packet(version=$version, dateTime='$dateTime')"
    }


}