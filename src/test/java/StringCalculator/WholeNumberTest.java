package StringCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

public class WholeNumberTest {

    @Test
    @DisplayName("음수는 런타임에러 발생")
    void negativeNumberThrowsError() {
        assertThatThrownBy(() -> new WholeNumber(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageMatching("음수는 덧셈 대상이 될 수 없습니다.");
    }

    @DisplayName("WholeNumber 정상적으로 생성")
    @ParameterizedTest(name="param: 정수 {0}")
    @ValueSource(ints = {1,2,3})
    void successfully(int param) {
        assertThat(new WholeNumber(param)).isEqualTo(new WholeNumber(param));
    }
}
