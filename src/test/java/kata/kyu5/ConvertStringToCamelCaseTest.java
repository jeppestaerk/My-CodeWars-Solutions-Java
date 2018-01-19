package kata.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertStringToCamelCaseTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }

    @Test
    public void testLongOne() {
        String input = "You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields";
        System.out.println("input: " + input);
        assertEquals("YouHaveChosenToTranslateThisKataForYourConvenienceWeHaveProvidedTheExistingTestCasesUsedForTheLanguageThatYouHaveAlreadyCompletedAsWellAsAllOfTheOtherRelatedFields", ConvertStringToCamelCase.toCamelCase(input));
    }

    @Test
    public void shouldWorkWithRandomValues() {
        String input = "bridge-Street-down-Wall-Green-down-river-Street-Street-Black";
        System.out.println("input: " + input);
        assertEquals("bridgeStreetDownWallGreenDownRiverStreetStreetBlack", ConvertStringToCamelCase.toCamelCase(input));
    }
}