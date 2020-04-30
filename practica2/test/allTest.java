
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses ({
    ForumSystem.ComentTest.class,
    ForumSystem.ForumTest.class,
    ForumSystem.NickVoteTest.class,
    ForumSystem.NotificationTest.class,
    ForumSystem.PostTest.class,
    ForumSystem.SubForumTest.class,
    ForumSystem.PostContent.ContentTest.class,
    ForumSystem.PostContent.ExercisesTest.class,
    ForumSystem.PostContent.PlainTextTest.class,
    ForumSystem.PostContent.PollTest.class,
    LoginSystem.IdentifierTest.class,
    UserSystem.BanTest.class,
    UserSystem.GuestTest.class,
    UserSystem.VisitorTest.class,
    UserSystem.Users.StudentTest.class,
    UserSystem.Users.TeacherTest.class,
    UserSystem.Users.UserTest.class   
})
public class allTest {
    
}
