package hello.core.member;

public class MemberServicelmpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServicelmpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long member) {
        return memberRepository.findById(member);
    }
}
