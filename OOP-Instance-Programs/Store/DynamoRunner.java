class DynamoRunner {
    public static void main(String[] args) {

        Dynamo dynamo = new Dynamo();

        dynamo.saveDynamo("Bosch");
        dynamo.saveDynamo("Lucas");
        dynamo.saveDynamo("Valeo");
        dynamo.saveDynamo("Denso");
        dynamo.saveDynamo("Hitachi");

        dynamo.search("Bosch");
        dynamo.search("Sony");
    }
}