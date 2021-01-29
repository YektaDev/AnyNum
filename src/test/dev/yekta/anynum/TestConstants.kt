package dev.yekta.anynum

internal const val INDEX_MIXED = 0
internal const val INDEX_EN = 1
internal const val INDEX_AR = 2
internal const val INDEX_FA = 3

internal val strings = listOf(
    listOf(
        "", // [0] -> Mixed numbers
        "", // [1] -> English numbers
        "", // [2] -> Arabic numbers
        "", // [3] -> Persian numbers
    ),
    listOf(
        "۱۲۳456٧٨٩0",
        "1234567890",
        "١٢٣٤٥٦٧٨٩٠",
        "۱۲۳۴۵۶۷۸۹۰",
    ),
    listOf(
        "۰",
        "0",
        "٠",
        "۰",
    ),
    listOf(
        "This is AnyNum!@#$%^&*()_+,\tI like it ۸ times m0re than c0ff3٣!\n\n As 1ong as this is just ۱ test,\r I don't care if it rains for 9٩76 hours!!!  0٠",
        "This is AnyNum!@#$%^&*()_+,\tI like it 8 times m0re than c0ff33!\n\n As 1ong as this is just 1 test,\r I don't care if it rains for 9976 hours!!!  00",
        "This is AnyNum!@#$%^&*()_+,\tI like it ٨ times m٠re than c٠ff٣٣!\n\n As ١ong as this is just ١ test,\r I don't care if it rains for ٩٩٧٦ hours!!!  ٠٠",
        "This is AnyNum!@#$%^&*()_+,\tI like it ۸ times m۰re than c۰ff۳۳!\n\n As ۱ong as this is just ۱ test,\r I don't care if it rains for ۹۹۷۶ hours!!!  ۰۰",
    ),
    listOf(
        "9999999999999999999999999999999988888888888888888888888888888888888٨٨٨٧٧٧777777777777777777777777777777777777766666666666666666666666666۵۵۵۵٥٥٥٥٥5555555555555555555444444444444443333333333٣٣٣3333333333333333222222222222222211111۱۱۱۱111111111111111111110000000000000000000000",
        "9999999999999999999999999999999988888888888888888888888888888888888888777777777777777777777777777777777777777766666666666666666666666666555555555555555555555555555544444444444444333333333333333333333333333332222222222222222111111111111111111111111111110000000000000000000000",
        "٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٩٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٨٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٧٦٦٦٦٦٦٦٦٦٦٦٦٦٦٦٦٦٦٦٦٦٦٦٦٦٦٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٥٤٤٤٤٤٤٤٤٤٤٤٤٤٤٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٣٢٢٢٢٢٢٢٢٢٢٢٢٢٢٢٢١١١١١١١١١١١١١١١١١١١١١١١١١١١١١٠٠٠٠٠٠٠٠٠٠٠٠٠٠٠٠٠٠٠٠٠٠",
        "۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۹۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۸۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۷۶۶۶۶۶۶۶۶۶۶۶۶۶۶۶۶۶۶۶۶۶۶۶۶۶۶۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۵۴۴۴۴۴۴۴۴۴۴۴۴۴۴۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۳۲۲۲۲۲۲۲۲۲۲۲۲۲۲۲۲۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۱۰۰۰۰۰۰۰۰۰۰۰۰۰۰۰۰۰۰۰۰۰۰",
    ),
    listOf(
        "۱   2",
        "1   2",
        "١   ٢",
        "۱   ۲",
    ),
    listOf(
        "...",
        "...",
        "...",
        "...",
    ),
    listOf(
        "5cb٩٠a0a76baee7bb9٣6۴a636۵۸۸a8bb",
        "5cb90a0a76baee7bb9364a636588a8bb",
        "٥cb٩٠a٠a٧٦baee٧bb٩٣٦٤a٦٣٦٥٨٨a٨bb",
        "۵cb۹۰a۰a۷۶baee۷bb۹۳۶۴a۶۳۶۵۸۸a۸bb",
    ),
    listOf(
        "u&D%qRjEpBD{F}z@D\$BRKvEYB+d=tp_.={JXH]!.KPYrX;k)Gz#yZ\$=k&Um\$nEy?%nm,]cj?HSKFaAh&=R_!axEf?PhE*@Swmdk--Ma[]Dc\$GeaL;ZJRtm_v_CWVT=e:gH==G{!PQHdhEcxLQWQHnxV.:wMxdVr*GYu;n=RDjq.(ifX.jgcZ}Nje!zG&?Ch.*hA-WZ-YWaNGEncJ#cv,FRRv_=-Tv/RD/PF(Qx)vbAY#,[pS.]&i?%ymv@#!c.t&zmG_T_?iAgnmB;}YnCEqV%nFag}L&qv!vQZDv=[E[w#e*H){y)TnNMFaC/g,_*HNnf}Zeq:i&=AgBv#i[&UAQCJJZ=_feVgBhjX=G,=cja+GVu*cA-n!{QigPR{qVeLK,d&:Y}Jw={Dq)Un;ZK}!e!%D&Mih_zeU_{LNG+WVR&pf(}QFKdV#p&H#*bu%Gq??Z[Tkb?@LP%N]&fJbt,xn=Wz}m,??]&vp#&ZW!H:_/H-=ytpM%#p-+{b.MP!BM(TcU+d(eKH%xc;/%g*)xP]TV]W!_X\$vaY;;&gSBnMfNnaHj.a]#@@[x}\$+YP!Z!ZEq%Cp\$qX#:er&!AdL#Dd.*kR*wm-P]_JTzebJd}xkAZeDbAi&@+DMG]GmXmL&k,QPV+NE{?Sz+?p*kTM{]FZAGU,\$BV*{g#fBmRhb{YQDS#]{]kHHPMM]\$DB+[fmxV@=gG?%bQC)ad*bY+!C&(-:fkw%Hycy[F}{y,]{UABW[&/{X:zz@UZ,\$(]@KKmNv;wMx&}XiL)nUy}Cng=U]HCBFxXF.Px]L+pm*nu\$VXLbmy#)AB{)@ch;G}Cw)TtNG%v&gMML%AvULp+Bzf(Yqk?F-mQ\$]}jJn*YZg[#ejQFjGdYBTq%(qAzufay?@)LC@BhKmccpjR(T*+kWi;::}vXa-&ucY+z.f&m%aSy[!=]ZGr&&).&;gf@ZGwU*hD{{NXarZb--c-\$%MJMX-Uahq%(=uMKnSE:v?mC+@AmNKH_X+(&",
        "u&D%qRjEpBD{F}z@D\$BRKvEYB+d=tp_.={JXH]!.KPYrX;k)Gz#yZ\$=k&Um\$nEy?%nm,]cj?HSKFaAh&=R_!axEf?PhE*@Swmdk--Ma[]Dc\$GeaL;ZJRtm_v_CWVT=e:gH==G{!PQHdhEcxLQWQHnxV.:wMxdVr*GYu;n=RDjq.(ifX.jgcZ}Nje!zG&?Ch.*hA-WZ-YWaNGEncJ#cv,FRRv_=-Tv/RD/PF(Qx)vbAY#,[pS.]&i?%ymv@#!c.t&zmG_T_?iAgnmB;}YnCEqV%nFag}L&qv!vQZDv=[E[w#e*H){y)TnNMFaC/g,_*HNnf}Zeq:i&=AgBv#i[&UAQCJJZ=_feVgBhjX=G,=cja+GVu*cA-n!{QigPR{qVeLK,d&:Y}Jw={Dq)Un;ZK}!e!%D&Mih_zeU_{LNG+WVR&pf(}QFKdV#p&H#*bu%Gq??Z[Tkb?@LP%N]&fJbt,xn=Wz}m,??]&vp#&ZW!H:_/H-=ytpM%#p-+{b.MP!BM(TcU+d(eKH%xc;/%g*)xP]TV]W!_X\$vaY;;&gSBnMfNnaHj.a]#@@[x}\$+YP!Z!ZEq%Cp\$qX#:er&!AdL#Dd.*kR*wm-P]_JTzebJd}xkAZeDbAi&@+DMG]GmXmL&k,QPV+NE{?Sz+?p*kTM{]FZAGU,\$BV*{g#fBmRhb{YQDS#]{]kHHPMM]\$DB+[fmxV@=gG?%bQC)ad*bY+!C&(-:fkw%Hycy[F}{y,]{UABW[&/{X:zz@UZ,\$(]@KKmNv;wMx&}XiL)nUy}Cng=U]HCBFxXF.Px]L+pm*nu\$VXLbmy#)AB{)@ch;G}Cw)TtNG%v&gMML%AvULp+Bzf(Yqk?F-mQ\$]}jJn*YZg[#ejQFjGdYBTq%(qAzufay?@)LC@BhKmccpjR(T*+kWi;::}vXa-&ucY+z.f&m%aSy[!=]ZGr&&).&;gf@ZGwU*hD{{NXarZb--c-\$%MJMX-Uahq%(=uMKnSE:v?mC+@AmNKH_X+(&",
        "u&D%qRjEpBD{F}z@D\$BRKvEYB+d=tp_.={JXH]!.KPYrX;k)Gz#yZ\$=k&Um\$nEy?%nm,]cj?HSKFaAh&=R_!axEf?PhE*@Swmdk--Ma[]Dc\$GeaL;ZJRtm_v_CWVT=e:gH==G{!PQHdhEcxLQWQHnxV.:wMxdVr*GYu;n=RDjq.(ifX.jgcZ}Nje!zG&?Ch.*hA-WZ-YWaNGEncJ#cv,FRRv_=-Tv/RD/PF(Qx)vbAY#,[pS.]&i?%ymv@#!c.t&zmG_T_?iAgnmB;}YnCEqV%nFag}L&qv!vQZDv=[E[w#e*H){y)TnNMFaC/g,_*HNnf}Zeq:i&=AgBv#i[&UAQCJJZ=_feVgBhjX=G,=cja+GVu*cA-n!{QigPR{qVeLK,d&:Y}Jw={Dq)Un;ZK}!e!%D&Mih_zeU_{LNG+WVR&pf(}QFKdV#p&H#*bu%Gq??Z[Tkb?@LP%N]&fJbt,xn=Wz}m,??]&vp#&ZW!H:_/H-=ytpM%#p-+{b.MP!BM(TcU+d(eKH%xc;/%g*)xP]TV]W!_X\$vaY;;&gSBnMfNnaHj.a]#@@[x}\$+YP!Z!ZEq%Cp\$qX#:er&!AdL#Dd.*kR*wm-P]_JTzebJd}xkAZeDbAi&@+DMG]GmXmL&k,QPV+NE{?Sz+?p*kTM{]FZAGU,\$BV*{g#fBmRhb{YQDS#]{]kHHPMM]\$DB+[fmxV@=gG?%bQC)ad*bY+!C&(-:fkw%Hycy[F}{y,]{UABW[&/{X:zz@UZ,\$(]@KKmNv;wMx&}XiL)nUy}Cng=U]HCBFxXF.Px]L+pm*nu\$VXLbmy#)AB{)@ch;G}Cw)TtNG%v&gMML%AvULp+Bzf(Yqk?F-mQ\$]}jJn*YZg[#ejQFjGdYBTq%(qAzufay?@)LC@BhKmccpjR(T*+kWi;::}vXa-&ucY+z.f&m%aSy[!=]ZGr&&).&;gf@ZGwU*hD{{NXarZb--c-\$%MJMX-Uahq%(=uMKnSE:v?mC+@AmNKH_X+(&",
        "u&D%qRjEpBD{F}z@D\$BRKvEYB+d=tp_.={JXH]!.KPYrX;k)Gz#yZ\$=k&Um\$nEy?%nm,]cj?HSKFaAh&=R_!axEf?PhE*@Swmdk--Ma[]Dc\$GeaL;ZJRtm_v_CWVT=e:gH==G{!PQHdhEcxLQWQHnxV.:wMxdVr*GYu;n=RDjq.(ifX.jgcZ}Nje!zG&?Ch.*hA-WZ-YWaNGEncJ#cv,FRRv_=-Tv/RD/PF(Qx)vbAY#,[pS.]&i?%ymv@#!c.t&zmG_T_?iAgnmB;}YnCEqV%nFag}L&qv!vQZDv=[E[w#e*H){y)TnNMFaC/g,_*HNnf}Zeq:i&=AgBv#i[&UAQCJJZ=_feVgBhjX=G,=cja+GVu*cA-n!{QigPR{qVeLK,d&:Y}Jw={Dq)Un;ZK}!e!%D&Mih_zeU_{LNG+WVR&pf(}QFKdV#p&H#*bu%Gq??Z[Tkb?@LP%N]&fJbt,xn=Wz}m,??]&vp#&ZW!H:_/H-=ytpM%#p-+{b.MP!BM(TcU+d(eKH%xc;/%g*)xP]TV]W!_X\$vaY;;&gSBnMfNnaHj.a]#@@[x}\$+YP!Z!ZEq%Cp\$qX#:er&!AdL#Dd.*kR*wm-P]_JTzebJd}xkAZeDbAi&@+DMG]GmXmL&k,QPV+NE{?Sz+?p*kTM{]FZAGU,\$BV*{g#fBmRhb{YQDS#]{]kHHPMM]\$DB+[fmxV@=gG?%bQC)ad*bY+!C&(-:fkw%Hycy[F}{y,]{UABW[&/{X:zz@UZ,\$(]@KKmNv;wMx&}XiL)nUy}Cng=U]HCBFxXF.Px]L+pm*nu\$VXLbmy#)AB{)@ch;G}Cw)TtNG%v&gMML%AvULp+Bzf(Yqk?F-mQ\$]}jJn*YZg[#ejQFjGdYBTq%(qAzufay?@)LC@BhKmccpjR(T*+kWi;::}vXa-&ucY+z.f&m%aSy[!=]ZGr&&).&;gf@ZGwU*hD{{NXarZb--c-\$%MJMX-Uahq%(=uMKnSE:v?mC+@AmNKH_X+(&",
    ),
    listOf(
        "٧٣٨٨٣٦٣٣٦٩٩٨٢9565893889359668577736739855387692668285886287883797356984629376453376526954858539776224374925966969883634236858297256352263936925878497288542483454489427625589975589788333384574366238466594338254397369244562482279687748769689786682857233569478966543924624592262722564323475457732852884279437293498643494898725739967527542723862858234523927245524222685966336999657645745386783636778299929428454686576726548748553499338524343832933926588422296896824673853923542545297934259829848252445667969922252362587567465779379799692986532332849293694383879889329296362525237628433559283668974478999523365279355674765653873647537774753895773226747594528972689286386468765465344897447745888325735594765697589298364688724995844259825864736344384685798753445483353699439729864372985899897762593384938254826862472369367449456855362762443572299323242256855596935467979723772975473672877243222279382265596987235574595746635526594688963845485664679627655554677766282455478844392497836697243276867۳۳۳۷۸۳۷۸۸۸۹",
        "7388363369982956589388935966857773673985538769266828588628788379735698462937645337652695485853977622437492596696988363423685829725635226393692587849728854248345448942762558997558978833338457436623846659433825439736924456248227968774876968978668285723356947896654392462459226272256432347545773285288427943729349864349489872573996752754272386285823452392724552422268596633699965764574538678363677829992942845468657672654874855349933852434383293392658842229689682467385392354254529793425982984825244566796992225236258756746577937979969298653233284929369438387988932929636252523762843355928366897447899952336527935567476565387364753777475389577322674759452897268928638646876546534489744774588832573559476569758929836468872499584425982586473634438468579875344548335369943972986437298589989776259338493825482686247236936744945685536276244357229932324225685559693546797972377297547367287724322227938226559698723557459574663552659468896384548566467962765555467776628245547884439249783669724327686733378378889",
        "٧٣٨٨٣٦٣٣٦٩٩٨٢٩٥٦٥٨٩٣٨٨٩٣٥٩٦٦٨٥٧٧٧٣٦٧٣٩٨٥٥٣٨٧٦٩٢٦٦٨٢٨٥٨٨٦٢٨٧٨٨٣٧٩٧٣٥٦٩٨٤٦٢٩٣٧٦٤٥٣٣٧٦٥٢٦٩٥٤٨٥٨٥٣٩٧٧٦٢٢٤٣٧٤٩٢٥٩٦٦٩٦٩٨٨٣٦٣٤٢٣٦٨٥٨٢٩٧٢٥٦٣٥٢٢٦٣٩٣٦٩٢٥٨٧٨٤٩٧٢٨٨٥٤٢٤٨٣٤٥٤٤٨٩٤٢٧٦٢٥٥٨٩٩٧٥٥٨٩٧٨٨٣٣٣٣٨٤٥٧٤٣٦٦٢٣٨٤٦٦٥٩٤٣٣٨٢٥٤٣٩٧٣٦٩٢٤٤٥٦٢٤٨٢٢٧٩٦٨٧٧٤٨٧٦٩٦٨٩٧٨٦٦٨٢٨٥٧٢٣٣٥٦٩٤٧٨٩٦٦٥٤٣٩٢٤٦٢٤٥٩٢٢٦٢٧٢٢٥٦٤٣٢٣٤٧٥٤٥٧٧٣٢٨٥٢٨٨٤٢٧٩٤٣٧٢٩٣٤٩٨٦٤٣٤٩٤٨٩٨٧٢٥٧٣٩٩٦٧٥٢٧٥٤٢٧٢٣٨٦٢٨٥٨٢٣٤٥٢٣٩٢٧٢٤٥٥٢٤٢٢٢٦٨٥٩٦٦٣٣٦٩٩٩٦٥٧٦٤٥٧٤٥٣٨٦٧٨٣٦٣٦٧٧٨٢٩٩٩٢٩٤٢٨٤٥٤٦٨٦٥٧٦٧٢٦٥٤٨٧٤٨٥٥٣٤٩٩٣٣٨٥٢٤٣٤٣٨٣٢٩٣٣٩٢٦٥٨٨٤٢٢٢٩٦٨٩٦٨٢٤٦٧٣٨٥٣٩٢٣٥٤٢٥٤٥٢٩٧٩٣٤٢٥٩٨٢٩٨٤٨٢٥٢٤٤٥٦٦٧٩٦٩٩٢٢٢٥٢٣٦٢٥٨٧٥٦٧٤٦٥٧٧٩٣٧٩٧٩٩٦٩٢٩٨٦٥٣٢٣٣٢٨٤٩٢٩٣٦٩٤٣٨٣٨٧٩٨٨٩٣٢٩٢٩٦٣٦٢٥٢٥٢٣٧٦٢٨٤٣٣٥٥٩٢٨٣٦٦٨٩٧٤٤٧٨٩٩٩٥٢٣٣٦٥٢٧٩٣٥٥٦٧٤٧٦٥٦٥٣٨٧٣٦٤٧٥٣٧٧٧٤٧٥٣٨٩٥٧٧٣٢٢٦٧٤٧٥٩٤٥٢٨٩٧٢٦٨٩٢٨٦٣٨٦٤٦٨٧٦٥٤٦٥٣٤٤٨٩٧٤٤٧٧٤٥٨٨٨٣٢٥٧٣٥٥٩٤٧٦٥٦٩٧٥٨٩٢٩٨٣٦٤٦٨٨٧٢٤٩٩٥٨٤٤٢٥٩٨٢٥٨٦٤٧٣٦٣٤٤٣٨٤٦٨٥٧٩٨٧٥٣٤٤٥٤٨٣٣٥٣٦٩٩٤٣٩٧٢٩٨٦٤٣٧٢٩٨٥٨٩٩٨٩٧٧٦٢٥٩٣٣٨٤٩٣٨٢٥٤٨٢٦٨٦٢٤٧٢٣٦٩٣٦٧٤٤٩٤٥٦٨٥٥٣٦٢٧٦٢٤٤٣٥٧٢٢٩٩٣٢٣٢٤٢٢٥٦٨٥٥٥٩٦٩٣٥٤٦٧٩٧٩٧٢٣٧٧٢٩٧٥٤٧٣٦٧٢٨٧٧٢٤٣٢٢٢٢٧٩٣٨٢٢٦٥٥٩٦٩٨٧٢٣٥٥٧٤٥٩٥٧٤٦٦٣٥٥٢٦٥٩٤٦٨٨٩٦٣٨٤٥٤٨٥٦٦٤٦٧٩٦٢٧٦٥٥٥٥٤٦٧٧٧٦٦٢٨٢٤٥٥٤٧٨٨٤٤٣٩٢٤٩٧٨٣٦٦٩٧٢٤٣٢٧٦٨٦٧٣٣٣٧٨٣٧٨٨٨٩",
        "۷۳۸۸۳۶۳۳۶۹۹۸۲۹۵۶۵۸۹۳۸۸۹۳۵۹۶۶۸۵۷۷۷۳۶۷۳۹۸۵۵۳۸۷۶۹۲۶۶۸۲۸۵۸۸۶۲۸۷۸۸۳۷۹۷۳۵۶۹۸۴۶۲۹۳۷۶۴۵۳۳۷۶۵۲۶۹۵۴۸۵۸۵۳۹۷۷۶۲۲۴۳۷۴۹۲۵۹۶۶۹۶۹۸۸۳۶۳۴۲۳۶۸۵۸۲۹۷۲۵۶۳۵۲۲۶۳۹۳۶۹۲۵۸۷۸۴۹۷۲۸۸۵۴۲۴۸۳۴۵۴۴۸۹۴۲۷۶۲۵۵۸۹۹۷۵۵۸۹۷۸۸۳۳۳۳۸۴۵۷۴۳۶۶۲۳۸۴۶۶۵۹۴۳۳۸۲۵۴۳۹۷۳۶۹۲۴۴۵۶۲۴۸۲۲۷۹۶۸۷۷۴۸۷۶۹۶۸۹۷۸۶۶۸۲۸۵۷۲۳۳۵۶۹۴۷۸۹۶۶۵۴۳۹۲۴۶۲۴۵۹۲۲۶۲۷۲۲۵۶۴۳۲۳۴۷۵۴۵۷۷۳۲۸۵۲۸۸۴۲۷۹۴۳۷۲۹۳۴۹۸۶۴۳۴۹۴۸۹۸۷۲۵۷۳۹۹۶۷۵۲۷۵۴۲۷۲۳۸۶۲۸۵۸۲۳۴۵۲۳۹۲۷۲۴۵۵۲۴۲۲۲۶۸۵۹۶۶۳۳۶۹۹۹۶۵۷۶۴۵۷۴۵۳۸۶۷۸۳۶۳۶۷۷۸۲۹۹۹۲۹۴۲۸۴۵۴۶۸۶۵۷۶۷۲۶۵۴۸۷۴۸۵۵۳۴۹۹۳۳۸۵۲۴۳۴۳۸۳۲۹۳۳۹۲۶۵۸۸۴۲۲۲۹۶۸۹۶۸۲۴۶۷۳۸۵۳۹۲۳۵۴۲۵۴۵۲۹۷۹۳۴۲۵۹۸۲۹۸۴۸۲۵۲۴۴۵۶۶۷۹۶۹۹۲۲۲۵۲۳۶۲۵۸۷۵۶۷۴۶۵۷۷۹۳۷۹۷۹۹۶۹۲۹۸۶۵۳۲۳۳۲۸۴۹۲۹۳۶۹۴۳۸۳۸۷۹۸۸۹۳۲۹۲۹۶۳۶۲۵۲۵۲۳۷۶۲۸۴۳۳۵۵۹۲۸۳۶۶۸۹۷۴۴۷۸۹۹۹۵۲۳۳۶۵۲۷۹۳۵۵۶۷۴۷۶۵۶۵۳۸۷۳۶۴۷۵۳۷۷۷۴۷۵۳۸۹۵۷۷۳۲۲۶۷۴۷۵۹۴۵۲۸۹۷۲۶۸۹۲۸۶۳۸۶۴۶۸۷۶۵۴۶۵۳۴۴۸۹۷۴۴۷۷۴۵۸۸۸۳۲۵۷۳۵۵۹۴۷۶۵۶۹۷۵۸۹۲۹۸۳۶۴۶۸۸۷۲۴۹۹۵۸۴۴۲۵۹۸۲۵۸۶۴۷۳۶۳۴۴۳۸۴۶۸۵۷۹۸۷۵۳۴۴۵۴۸۳۳۵۳۶۹۹۴۳۹۷۲۹۸۶۴۳۷۲۹۸۵۸۹۹۸۹۷۷۶۲۵۹۳۳۸۴۹۳۸۲۵۴۸۲۶۸۶۲۴۷۲۳۶۹۳۶۷۴۴۹۴۵۶۸۵۵۳۶۲۷۶۲۴۴۳۵۷۲۲۹۹۳۲۳۲۴۲۲۵۶۸۵۵۵۹۶۹۳۵۴۶۷۹۷۹۷۲۳۷۷۲۹۷۵۴۷۳۶۷۲۸۷۷۲۴۳۲۲۲۲۷۹۳۸۲۲۶۵۵۹۶۹۸۷۲۳۵۵۷۴۵۹۵۷۴۶۶۳۵۵۲۶۵۹۴۶۸۸۹۶۳۸۴۵۴۸۵۶۶۴۶۷۹۶۲۷۶۵۵۵۵۴۶۷۷۷۶۶۲۸۲۴۵۵۴۷۸۸۴۴۳۹۲۴۹۷۸۳۶۶۹۷۲۴۳۲۷۶۸۶۷۳۳۳۷۸۳۷۸۸۸۹",
    ),
)