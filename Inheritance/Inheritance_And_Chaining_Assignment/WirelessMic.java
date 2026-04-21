class WirelessMic extends Mic {

    @Override
    void on() {
        System.out.println("WirelessMic ON");
    }

    @Override
    void increaseVolume() {
        System.out.println("WirelessMic volume up");
    }

    @Override
    void mute() {
        System.out.println("WirelessMic muted");
    }
}