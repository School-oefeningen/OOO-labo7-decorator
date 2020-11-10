package domain.model.karakterTransformator;

public class ElkeSpatieVerwijderd extends KarakterTransformatorDecorator {

    public ElkeSpatieVerwijderd(KarakterTransformatorInterface karakterTransformator) {
        super(karakterTransformator);
    }

    @Override
    public String transformString(String stringToTransform) {
        stringToTransform = super.transformString(stringToTransform);
        char[] characters = stringToTransform.toCharArray();
        String newString = "";

        for (char character: characters) {
            String letter = "";

            if (character != ' ') letter += String.valueOf(character);

            newString += letter;
        }

        return newString;
    }
}
