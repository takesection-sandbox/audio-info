package com.pigumer.audioinfo

import javax.sound.sampled.AudioSystem

object AudioInfo extends App {

  val mixerInfos = AudioSystem.getMixerInfo

  mixerInfos.zipWithIndex.foreach { zipped ⇒
    println(s"${zipped._2}: ${zipped._1}")
  }
}
