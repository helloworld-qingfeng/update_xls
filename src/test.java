import io.github.wechaty.Wechaty;
import io.github.wechaty.plugins.WechatyPlugins;
import io.github.wechaty.utils.QrcodeUtils;

public class test {
    public static void main(String[] args) {
        Wechaty bot = Wechaty.instance("wdjwojdwojdwojdwojdjwjdwjdwjdwdw")
                .use(
                        WechatyPlugins.ScanPlugin(),
                        WechatyPlugins.DingDongPlugin(null)
                )
                .start(true);
    }
}
