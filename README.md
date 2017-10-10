AudioInfo
=========

* [Raspberry Pi 1 or 2 or 3](https://www.raspberrypi.org/)
* USB Audio - [Creative MUVO 2c](https://us.creative.com/p/speakers/creative-muvo-2c)

```
$ sbt

> docker:clean
> docker:stage
> docker:publishLocal
> exit

$ docker save audio-info:0.1.0-SNAPSHOT -o audioinfo.tar
$ scp audioinfo.tar pi@<YOUR_RPi_HOSTNAME>.local:./
$ ssh pi@<YOUR_RPi_HOSTNAME>.local
pi $ cat audioinfo.tar | docker load
pi $ docker run --rm --privileged audio-info:0.1.0-SNAPSHOT
0: ALSA [default], version 4.9.35-v7+
1: ALSA [plughw:0,0], version 4.9.35-v7+
2: ALSA [plughw:0,1], version 4.9.35-v7+
3: C2c [plughw:1,0], version 4.9.35-v7+
4: Port ALSA [hw:0], version 4.9.35-v7+
5: Port C2c [hw:1], version 4.9.35-v7+
```
