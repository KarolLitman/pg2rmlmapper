package mapper.methods.path;

import java.util.HashSet;

public class alternativePath {

    public HashSet<minMaxQuantifier> list;

    public alternativePath() {
        list = new HashSet<>();
    }

    @Override
    public String toString() {
        return "alternativePath{" +
                "list=" + list +
                '}';
    }

    public HashSet<minMaxQuantifier> getAlternativePath() {
        return list;
    }

    public void setAlternativePath(HashSet<minMaxQuantifier> alternativePath) {
        this.list = alternativePath;
    }
}
