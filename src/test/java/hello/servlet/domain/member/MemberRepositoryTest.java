package hello.servlet.domain.member;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();

    //테스트 끝나고 초기화 하려고 만듬
    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save(){
        Member member = new Member("hello", 20);

        memberRepository.save(member);

        Member findMember = memberRepository.findById(member.getId());
        assertThat(findMember).isEqualTo(member);
    }

    @Test
    void findAll(){
        Member member = new Member("hello1", 11);
        Member member2 = new Member("hello2", 21);

        memberRepository.save(member);
        memberRepository.save(member2);

        List<Member> memberList = memberRepository.findAll();

        assertThat(memberList.size()).isEqualTo(2);
        assertThat(memberList).contains(member, member2);
    }

    @Test
    void testCode(){
        int[] list = {4,13,53,87};
        for(int i=0;i<list.length;i++){
            for(int j=i+1; j<list.length;j++){
                if(list[i]+list[j]==100) System.out.println("1 = " + 1);
                else System.out.println(" = " + 0 );
            }
        }
    }

}
