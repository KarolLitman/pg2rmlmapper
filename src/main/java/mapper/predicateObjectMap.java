package mapper;

class predicateObjectMap{
    String predicate;
    Object object;
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
