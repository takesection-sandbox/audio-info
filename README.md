AudioInfo
=========

* [Raspberry Pi 3](https://www.raspberrypi.org/)
* USB Audio - [Creative MUVO 2c](https://us.creative.com/p/speakers/creative-muvo-2c)

```
$ scp target/scala-2.12/audio-info-assembly-0.1.0-SNAPSHOT.jar pi@<YOUR_RPi_HOSTNAME>.local:./
$ ssh pi@<YOUR_RPi_HOSTNAME>.local "java -jar audio-info-assembly-0.1.0-SNAPSHOT.jar"
0: ALSA [default], version 4.9.35-v7+
1: ALSA [plughw:0,0], version 4.9.35-v7+
2: ALSA [plughw:0,1], version 4.9.35-v7+
3: C2c [plughw:1,0], version 4.9.35-v7+
4: Port ALSA [hw:0], version 4.9.35-v7+
5: Port C2c [hw:1], version 4.9.35-v7+
```
