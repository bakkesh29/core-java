class TestGarbage {
    public static void main(String[] args) {
        TestGarbage t = new TestGarbage();
        t.createObject();
    }

    Object createObject() {
        Object o1 = new Object();     // Step 1
        Object o2 = new Object();     // Step 2

        o1 = o2;                      // Step 3
        o2 = null;                    // Step 4

        return o1;                    // Step 5
    }
}