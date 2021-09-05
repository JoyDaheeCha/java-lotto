package lotto.number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumbers {

    private static final List<LottoNumber> candidates;

    static {
        candidates = IntStream.rangeClosed(LottoNumber.MIN, LottoNumber.MAX)
                .mapToObj(LottoNumber::new)
                .collect(Collectors.toList());
    }

    public List<LottoNumber> lottoNumbers(int length) {
        Collections.shuffle(candidates);
        List<LottoNumber> picked = new ArrayList<>(candidates.subList(0, length));
        Collections.sort(picked);
        return picked;
    }

}
