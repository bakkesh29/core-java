public class PaperData {
    public static void main(String[] args) {
        byte thicknessGsm = 80;
        short pagesInPack = 500;
        int stockQuantity = 125000;
        long batchId = 99887766554433L;
        float opacityPercentage = 92.5f;
        double pricePerBundle = 450.75;
        boolean isRecycled = true;
        char sizeFormat = 'A';

        System.out.println(thicknessGsm);
        System.out.println(pagesInPack);
        System.out.println(stockQuantity);
        System.out.println(batchId);
        System.out.println(opacityPercentage);
        System.out.println(pricePerBundle);
        System.out.println(isRecycled);
        System.out.println(sizeFormat);
    }
}