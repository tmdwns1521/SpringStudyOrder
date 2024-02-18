package hello.core.discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName(" VIP는 10% 할인이 적용 되어야 한다. ")
    void vip_o() {
        
        Member member = new Member(1L, "memberVIP", Grade.VIP);

        int discount = discountPolicy.discount(member, 10000);

        Assertions.assertThat(discount).isEqualTo(0);

    }

    @Test
    @DisplayName(" VIP가 아니면 10% 할인이 적용 되지 않아야 한다. ")
    void vip_x() {
        
        Member member = new Member(1L, "memberVIP", Grade.SILVER);

        int discount = discountPolicy.discount(member, 10000);

        Assertions.assertThat(discount).isEqualTo(0);

    }
}
