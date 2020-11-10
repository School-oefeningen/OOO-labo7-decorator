package domain.model.karakterTransformator;

public abstract class KarakterTransformatorDecorator implements KarakterTransformatorInterface {
    private final KarakterTransformatorInterface karakterTransformator;

    public KarakterTransformatorDecorator(KarakterTransformatorInterface karakterTransformator) {
        this.karakterTransformator = karakterTransformator;
    }

    public String transformString(String stringToTransform) {
        return karakterTransformator.transformString(stringToTransform);
    }
}
