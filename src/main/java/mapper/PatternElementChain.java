package mapper;

import property_graph.edge;
import property_graph.vertex;

public class PatternElementChain {
    edge RelationshipPattern;
    vertex NodePattern;
    boolean LeftArrow;
    boolean RightArrow;
    int minHops=1;
    int maxHops=1;


    public int getMinHops() {
        return minHops;
    }

    public void setMinHops(int minHops) {
        this.minHops = minHops;
    }

    public int getMaxHops() {
        return maxHops;
    }

    public void setMaxHops(int maxHops) {
        this.maxHops = maxHops;
    }

    public boolean isLeftArrow() {
        return LeftArrow;
    }

    public void setLeftArrow(boolean leftArrow) {
        LeftArrow = leftArrow;
    }

    public boolean isRightArrow() {
        return RightArrow;
    }

    public void setRightArrow(boolean rightArrow) {
        RightArrow = rightArrow;
    }

    @Override
    public String toString() {
        return "PatternElementChain{" +
                "RelationshipPattern=" + RelationshipPattern +
                ", NodePattern=" + NodePattern +
                '}';
    }

    public edge getRelationshipPattern() {
        return RelationshipPattern;
    }

    public void setRelationshipPattern(edge relationshipPattern) {
        RelationshipPattern = relationshipPattern;
    }

    public vertex getNodePattern() {
        return NodePattern;
    }

    public void setNodePattern(vertex nodePattern) {
        NodePattern = nodePattern;
    }

    public PatternElementChain() {
        LeftArrow=false;
        RightArrow=false;

    }
}
