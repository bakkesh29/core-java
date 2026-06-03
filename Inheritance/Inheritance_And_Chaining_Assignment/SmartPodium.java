class SmartPodium extends Podium2 {

    @Override
    void speak() {
        System.out.println("SmartPodium speaking");
    }

    @Override
    void adjustHeight() {
        System.out.println("SmartPodium adjusting height");
    }

    @Override
    void setupMic() {
        System.out.println("SmartPodium setup mic");
    }
}