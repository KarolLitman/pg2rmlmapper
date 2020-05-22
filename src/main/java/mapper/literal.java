package mapper;

class literal{
    String reference;
    String language;
    String datatype;
    literal(){}

    @Override
    public String toString() {
        return "literal{" +
                "reference='" + reference + '\'' +
                ", language='" + language + '\'' +
                ", datatype='" + datatype + '\'' +
                '}';
    }
}
