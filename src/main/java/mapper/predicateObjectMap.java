package mapper;

class predicateObjectMap{
    String predicate;
    Object object;
//    String reference;
//    String langtag;
//    String datatype;
//    String template;
//    predicateObjectMap(literal l){
//        object=l;
//    }
//    predicateObjectMap(String template){
//        object=template;
//    }
    @Override
    public String toString() {
        return "predicateObjectMap{" +
                "predicate='" + predicate + '\'' +
                ",Object=" + object +
                '}';
    }

    public void setObject(literal l) {
        this.object = l;
    }
    public void setObject(String template) {
        this.object = template;
    }
}
