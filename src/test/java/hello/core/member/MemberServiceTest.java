package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import hello.core.AppConfig;

public class MemberServiceTest {
    
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    
    @Test
    void join() {

        Member member = new Member(1L, "memberA", Grade.VIP);

        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
