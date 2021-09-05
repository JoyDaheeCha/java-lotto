package lotto.number;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("랜덤 넘버 리스트:")
class RandomNumbersTest {

    public static final int RANDOM_NUMBERS_FIRST_INDEX = 0;
    public static final int RANDOM_NUMBERS_LAST_INDEX = 5;
    private static RandomNumbers randomNumbers;

    @BeforeAll
    static void setUp() {
        randomNumbers = new RandomNumbers();
    }

    @DisplayName("최댓값은 45")
    @Test
    void maximum() {
        assertThat(randomNumbers.lottoNumbers(LottoNumbers.NUMBERS_LENGTH).get(RANDOM_NUMBERS_LAST_INDEX).value() <= new LottoNumber(LottoNumber.MAX).value()).isTrue();
    }


    @DisplayName("최솟값은 1")
    @Test
    void minimum() {
        assertThat(randomNumbers.lottoNumbers(LottoNumbers.NUMBERS_LENGTH).get(RANDOM_NUMBERS_FIRST_INDEX).value() >= new LottoNumber(LottoNumber.MIN).value()).isTrue();
    }

    @DisplayName("랜덤넘버는 45개의 static 값이다.")
    @Test
    void static45Values() {
        List<LottoNumber> actual = randomNumbers.lottoNumbers(LottoNumber.MAX);
        List<LottoNumber> expected = randomNumbers.lottoNumbers(LottoNumber.MAX);

        IntStream.range(0, LottoNumber.MAX)
                .forEach(i -> assertThat(actual.get(i)).isSameAs(expected.get(i)));
    }
}
