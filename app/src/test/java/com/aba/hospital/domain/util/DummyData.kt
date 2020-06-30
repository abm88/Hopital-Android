package com.aba.hospital.domain.util

import com.aba.hospital.domain.model.HospitalDomainModel

val SOME_TEXT = "SOME_TEXT"


val SOME_DOMAIN_MODEL = HospitalDomainModel(
    organisationID = "organisationID",
    organisationCode = "organisationCode",
    organisationType = "organisationType",
    subType = "subType",
    sector = "sector",
    organisationStatus = "organisationStatus",
    isPimsManaged = "isPimsManaged",
    organisationName = "organisationName",
    address1 = "address1",
    address2 = "address2",
    address3 = "address3",
    city = "city",
    county = "county",
    postcode = "postcode",
    latitude = "latitude",
    parentODSCode = "parentODSCode",
    parentName = "parentName",
    phone = "phone",
    email = "email",
    website = "website",
    fax = "fax"
)

val SOME_OTHER_DOMAIN_MODEL = HospitalDomainModel(
    organisationID = "other organisationID",
    organisationCode = "other organisationCode",
    organisationType = "other organisationType",
    subType = "other subType",
    sector = "other sector",
    organisationStatus = "other organisationStatus",
    isPimsManaged = "other isPimsManaged",
    organisationName = "other organisationName",
    address1 = "other address1",
    address2 = "other address2",
    address3 = "other address3",
    city = "other city",
    county = "other county",
    postcode = "other postcode",
    latitude = "other latitude",
    parentODSCode = "other parentODSCode",
    parentName = "other parentName",
    phone = "other phone",
    email = "other email",
    website = "other website",
    fax = "other fax"
)


val SOME_DOMAIN_MODELS = listOf(SOME_DOMAIN_MODEL, SOME_OTHER_DOMAIN_MODEL)


val SOME_RESPONSE_BODY = """
    462557	NMJ07	Hospital	Hospital	Independent Sector	Visible	True	Cygnet Hospital Derby		City Gate	London Road	Derby	Derbyshire	DE24 8WZ	52.907474517822266	-1.4549915790557861	NMJ	Cygnet Health Care Limited	01332 365434	markvarney@cygnethealth.co.uk	www.cygnethealth.co.uk/locations/derby	01332 292974
    462558	NMJ08	Hospital	Hospital	Independent Sector	Visible	True	Cygnet Hospital Ealing		22 Corfton Road		Ealing		W5 2HT	51.521167755126953	-0.29712009429931641	NMJ	Cygnet Health Care Limited	020 8991 6699	aktharhussain@cygnethealth.co.uk	http://www.cygnethealth.co.uk/locations/ealing/index.html	020 8991 0440
    462559	NMJ09	Hospital	Hospital	Independent Sector	Visible	True	Cygnet Hospital Harrogate		23 Ripon Road		Harrogate	North Yorkshire	HG1 2JL	53.999778747558594	-1.5477558374404907	NMJ	Cygnet Health Care Limited	01423 500599	kellynettleton@cygnethealth.co.uk	http://www.cygnethealth.co.uk/locations/harrogate/index.html	
    462560	NMJ10	Hospital	Hospital	Independent Sector	Visible	True	Cygnet Hospital Harrow		London Road		Harrow on the Hill	Middlesex	HA1 3JL	51.567092895507812	-0.33796963095664978	NMJ	Cygnet Health Care Limited	020 8966 7000	seamusquigley@cygnethealth.co.uk	http://www.cygnethealth.co.uk/locations/harrow/index.html	020 8864 6092
    462561	NMJ11	Hospital	Hospital	Independent Sector	Visible	True	Cygnet Hospital Stevenage		Graveley Road		Stevenage		SG1 4YS	51.928264617919922	-0.21576625108718872	NMJ	Cygnet Health Care Limited	01438 342942	jemmalacey@cygnethealth.co.uk	www.cygnethealth.co.uk/locations/stevenage/	01438 721147
    462562	NMJ12	Hospital	Hospital	Independent Sector	Visible	True	Cygnet Hospital Wyke		Blankney Grange	Huddersfield Road, Wyke	Bradford	West Yorkshire	BD12 8LR	53.728496551513672	-1.7745668888092041	NMJ	Cygnet Health Care Limited	01274 605500	richardwilliams@cygnethealth.co.uk	www.cygnethealth.co.uk/locations/wyke/	01274 604400
    462563	NMJ13	Hospital	UNKNOWN	Independent Sector	Visible	True	Cygnet Lodge Lewisham		44 Lewisham Park	Lewisham	London		SE13 6QZ	51.452018737792969	-1.2847439385950565E-2	NMJ	Cygnet Health Care Limited	020 8314 5123	michellemcwilliam@cygnethealth.co.uk	www.cygnethealth.co.uk/locations/lewisham/	020 8314 5271
    462564	NMJ14	Hospital	UNKNOWN	Independent Sector	Visible	True	Cygnet Lodge Westlands		74 Kenton Road		Kenton	Middlesex	HA3 8AE	51.580780029296875	-0.31983307003974915	NMJ	Cygnet Health Care Limited	020 8907 0770	aktharhussain@cygnethealth.co.uk	http://www.cygnethealth.co.uk/locations/kenton/index.html	020 8907 0772
    462680	NMV17	Hospital	Hospital	Independent Sector	Visible	True	Partnerships in Care Llanarth Court Hospital		Llanarth Raglan	Abergavenny	Monmouthshire		NP15 2YD	51.789508819580078	-2.899198055267334	NMV	Partnerships In Care Ltd	01873 840 555	karin.wathen@partnershipsincare.co.uk	www.partnershipsincare.co.uk	
    462829	NV248	Hospital	UNKNOWN	NHS Sector	Visible	True	The Huntercombe Hospital - Norwich	Buxton			Norwich	Norfolk	NR10 5RH	52.761032104492188	1.2810996770858765	NV2	The Huntercombe Group				
    570357	NEM13	Hospital	UNKNOWN	NHS Sector	Visible	False	Chartwell Private Hospital	1629 London Road			Leigh-On-Sea	Essex	SS9 2SQ	51.547977447509766	0.6373521089553833	NEM	Diagnostic Healthcare Ltd				
    570366	RXM02	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Hartington Unit	Hartington Unit	Chesterfield Royal Hospital	Calow	Chesterfield	Derbyshire	S44 5BL	53.235836029052734	-1.3960041999816895	RXM	Derbyshire Healthcare NHS Foundation Trust	01246 512563	patientexperience@derbyshcft.nhs.uk	http://www.derbyshirehealthcareft.nhs.uk/	
    570716	RX3AB	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Mental health services at The Friarage Hospital, Northallerton				Northallerton		DL6 1JG	54.342628479003906	-1.4303607940673828	RX3	Tees, Esk and Wear Valleys NHS Foundation Trust	01609 779911		http://www.tewv.nhs.uk/thefriarage	
    570717	RX3AZ	Hospital	Mental Health Hospital	NHS Sector	Visible	True	The Briary Wing at Harrogate District Hospital				Harrogate		HG2 7SX	53.993801116943359	-1.5178177356719971	RX3	Tees, Esk and Wear Valleys NHS Foundation Trust	01423 885959		http://www.tewv.nhs.uk/harrogatedistrict	
    750498	NQA64	Hospital	Hospital	NHS Sector	Visible	False	Halstead Hospital	78 Hedingham Road			Halstead	Essex	CO9 2DL	51.948272705078125	0.63791847229003906	NQA	Provide				
    750910	RYXC1	Hospital	Hospital	NHS Sector	Visible	True	Sexual Health Clinic at Charing Cross Hospital		Fulham Palace Road				W6 8RF	51.487052917480469	-0.21992063522338867	RYX	Central London Community Healthcare NHS Trust				
    864654	TAD16	Hospital	UNKNOWN	NHS Sector	Visible	True	Airedale Centre for Mental Health		Airedale General Hospital				BD20 6TD	53.898017883300781	-1.9626796245574951	TAD	Bradford District Care Trust				
    864773	RCBCA	Hospital	Hospital	NHS Sector	Visible	True	Scarborough Hospital		Woodlands Drive		Scarborough		YO12 6QL	54.281707763671875	-0.4346919059753418	RCB	York Teaching Hospital NHS Foundation Trust	01723 368111	pals.scarborough@york.nhs.uk	http://www.york.nhs.uk	01723 342 581
    864774	RCBNH	Hospital	Hospital	NHS Sector	Visible	True	Bridlington & District Hospital		Bessingby Road		Bridlington		YO16 4QP	54.086444854736328	-0.21597333252429962	RCB	York Teaching Hospital NHS Foundation Trust	01262 606666	pals.scarborough@york.nhs.uk	http://www.york.nhs.uk/	
    978682	NW611	Hospital	Hospital	NHS Sector	Visible	False	Wellington Hospital	Wellington South	Wellington Place		London	Greater London	NW9 9LE	51.591178894042969	-0.27784371376037598	NW6	Hca International				
    978692	RW504	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Scott Clinic		Rainhill Road				WA9 5BD	53.425544738769531	-2.7625188827514648	RW4	Mersey Care NHS Trust	0151 473 0303			
    978693	RW505	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Broadoak Unit	Broadoak Unit	Thomas Drive		Liverpool		L14 3PJ	53.410667419433594	-2.8972876071929932	RW4	Mersey Care NHS Trust	0151 473 0303		http://www.merseycare.nhs.uk	
    978694	RW506	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Windsor House	Windsor House	Upper Parliament Street		Liverpool		L8 7LF	53.39556884765625	-2.9693813323974609	RW4	Mersey Care NHS Trust	0151 473 0303		http://www.merseycare.nhs.uk	
    978695	RW507	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Mossley Hill Hosptial	Mossley Hill Hospital	Park Avenue		Liverpool		L18 8BU	53.380207061767578	-2.9283821582794189	RW4	Mersey Care NHS Trust	0151 473 0303		http://www.merseycare.nhs.uk	
    978699	RW511	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Rathbone Hospital	Rathbone Hospital	Mill Lane		Liverpool		L13 4AW	53.407588958740234	-2.915635347366333	RW4	Mersey Care NHS Trust	0151 473 0303		http://www.merseycare.nhs.uk	
    978700	RW512	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Stoddart House	Stoddart House	Lower Lane		Liverpool		L9 7AL	53.467922210693359	-2.9351162910461426	RW4	Mersey Care NHS Trust	0151 473 0303		http://www.merseycare.nhs.uk	
    978701	RW513	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Boothroyd Unit	Boothroyd Unit	Scarisbrick New Road		Southport		PR8 6PH	53.633224487304687	-2.9791626930236816	RW4	Mersey Care NHS Trust	0151 473 0303		http://www.merseycare.nhs.uk	
    978723	RY922	Hospital	UNKNOWN	NHS Sector	Visible	True	Teddington Memorial Hospital	Teddington Memorial Hospital	Hampton Road		Teddington	Middlesex	TW11 0JL	51.426116943359375	-0.3408886194229126	RY9	Hounslow and Richmond Community Healthcare NHS Trust	020 8714 4000		http://www.hrch.nhs.uk/our-services/clinics-health-centres/teddington-memorial-hospital/	
    979371	RQY10	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Richmond Royal Hospital 		Kew Foot Road 				TW9 2TE	51.466712951660156	-0.30041500926017761	RQY	South West London and St George's Mental Health NHS Trust				
    979693	RATKG	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Foxglove Ward, King George Hospital		Barley Lane				IG3 8YB	51.580955505371094	0.11066816747188568	RAT	North East London NHS Foundation Trust				
    1094700	NTN41	Hospital	UNKNOWN	Independent Sector	Visible	True	Priory Hospital Keighley	2 Burley Court	Steeton		Keighley	West Yorkshire	BD20 6TU	53.895778656005859	-1.9534144401550293	NTN	Priory Group Limited	01535 657 350	keighley@priorygroup.com	http://www.priorygroup.com/	01535 657 349
    1094717	NTN42	Hospital	UNKNOWN	Independent Sector	Visible	True	Priory Hospital Market Weighton	27 Holme Road	Market Weighton	East Riding of Yorkshire	York	North Yorkshire	YO43 3EQ	53.864238739013672	-0.67067086696624756	NTN	Priory Group Limited	01430 879 656	marketweighton@priorygroup.com	http://www.priorygroup.com/	01430 871 630
    1094732	NTN39	Hospital	Hospital	Independent Sector	Visible	True	Priory Hospital Dewsbury		York Road	Earlsheaton	Dewsbury		WF12 7LB	53.693710327148438	-1.6142532825469971	NTN	Priory Group Limited	01924 436140	dewsbury@priorygroup.com	http://www.priorygroup.com/	
    1094870	NV215	Hospital	Hospital	Independent Sector	Visible	True	Beech House Hospital		Fordham Road				CB8 7LF	52.272815704345703	0.39147424697875977	NV2	The Huntercombe Group				
    1094960	NTN49	Hospital	Hospital	Independent Sector	Visible	True	Priory Hospital Church Village		Church Road	Tonteg	Nr Ponytypridd		CF38 1HE	51.572639465332031	-3.3169949054718018	NTN	Priory Group Limited	01443 219 930	churchvillage@priorygroup.com	http://www.priorygroup.com/	01443 219 935
    1094962	NTN52	Hospital	Hospital	Independent Sector	Visible	True	Priory Hospital Aberdare		Farm Road	Aberaman	Aberdare		CF44 6LJ	51.696647644042969	-3.4210107326507568	NTN	Priory Group Limited	01685 888 480	aberdare@priorygroup.vom	http://www.priorygroup.com/	01685 888 485
    1095149	NTN51	Hospital	Hospital	Independent Sector	Visible	True	Priory Hospital Cefn Carnau 		Cefn Carnau Lane	Thornhill	Caerphilly		CF83 1LX	51.556930541992188	-3.2100851535797119	NTN	Priory Group Limited	02920 883 345	cefncarnaureception@priorygroup.com	http://www.priorygroup.com/	02920 882 877
    1095154	RW1AC	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Parklands Hospital		Aldermaston Road				RG24 9RH	51.282779693603516	-1.1127300262451172	RW1	Southern Health NHS Foundation Trust	01256 817718			
    1095163	RGDT3	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Bootham Park Hospital		Bootham Park Hospital		York	Yorkshire	YO30 7BY	53.968074798583984	-1.0855846405029297	RGD	Leeds and York Partnership NHS Foundation Trust	01904 294600			
    1095168	RW178	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Fordingbridge Hospital		Bartons Road		Fordingbridge		SP6 1JD	50.928081512451172	-1.7931904792785645	RW1	Southern Health NHS Foundation Trust	01425 652255		http://www.southernhealth.nhs.uk/services/community-health-services/hospitals/fordingbridge/	
    1095179	RJZ30	Hospital	UNKNOWN	Independent Sector	Visible	True	Princess Royal University Hospital	Farnborough Common			Orpington	Kent	BR6 8ND	51.365715026855469	5.9639792889356613E-2	RJZ	King's College Hospital NHS Foundation Trust	01689 863000	kch-tr.palskent@nhs.net	http://pruh.kch.nhs.uk/	
    1095186	NTN54	Hospital	Hospital	Independent Sector	Visible	True	Priory Hospital Ty Gwyn Hall		Llantilio Pertholey	Abergavenny	Gwent		NP7 6NY	51.841991424560547	-3.004697322845459	NTN	Priory Group Limited	01873 856 004	tygwynhall@priorygroup.com	http://www.priorygroup.com/	01873 852 056
    1279531	NTT10	Hospital	UNKNOWN	NHS Sector	Visible	False	The Manor Hospital	Central Drive	Shirebrook		Mansfield	Nottinghamshire	NG20 8BA	53.201507568359375	-1.218539834022522	NTT	Cambian Healthcare Limited				
    1279606	RDU25	Hospital	UNKNOWN	Independent Sector	Visible	False	Heatherwood Hospital	London Road			Ascot	Berkshire	SL5 8AA	51.410167694091797	-0.68732357025146484	RDU	Frimley Health NHS Foundation Trust				
    1279646	NTPH1	Hospital	UNKNOWN	NHS Sector	Visible	True	Shepton Mallet NHS Treatment Centre	Shepton Mallet Treatment Centre	Old Wells Road		Shepton Mallet	Somerset	BA4 4LP	51.189731597900391	-2.5628621578216553	NTP	Care UK	01749 333600	chester.barnes@careuk.com	http://www.sheptonmallettreatmentcentre.nhs.uk/	01749 333601
    1279647	NTPH2	Hospital	UNKNOWN	NHS Sector	Visible	True	Emersons Green NHS Treatment Centre	The Brooms	Emersons Green		Bristol	Avon	BS16 7FH	51.503337860107422	-2.4842946529388428	NTP	Care UK	0117 906 1801	pamela.mackie@careuk.com	http://www.emersonsgreentreatmentcentre.nhs.uk/	0117 906 1950
    1279653	NTPH5	Hospital	UNKNOWN	NHS Sector	Visible	True	Peninsula NHS Treatment Centre	20 Brest Road	Derriford		Plymouth	Devon	PL6 5XP	50.412391662597656	-4.1176590919494629	NTP	Care UK	01752 506070	patricia.warwick@careuk.com	http://www.peninsulatreatmentcentre.nhs.uk/	
    1349252	RH5K6	Hospital	UNKNOWN	Independent Sector	Visible	True	Bridgwater Community Hospital	Bridgwater Community Hospital	Bower Lane		Bridgwater	Somerset	TA6 4GU	51.137973785400391	-2.971696138381958	RH5	Somerset Partnership NHS Foundation Trust	01278 436 555			
    1349578	RAJ50	Hospital	UNKNOWN	Independent Sector	Visible	False	The Chelmsford Private Day Surgery Hospital	Fenton House	85-89 New London Road		Chelmsford	Essex	CM2 0PP	51.730190277099609	0.47131988406181335	RAJ	Southend University Hospital NHS Foundation Trust				
    1349603	RTK61	Hospital	UNKNOWN	Independent Sector	Visible	True	Haslemere & District Hospital		Church Lane	Haslemere	Surrey		GU27 2BJ	51.091747283935547	-0.70823878049850464	RTK	Ashford and St Peter's Hospitals NHS Foundation Trust	01483 782300			
    1349731	NCNDC	Hospital	UNKNOWN	NHS Sector	Visible	False	Dmc Community Dermatology Service - Swale CCG (Sheppey Community Hospital)	Plover Road	Minster On Sea		Sheerness	Kent	ME12 3LT	51.415565490722656	0.79291254281997681	NCN	Dmc Healthcare				
    1349734	NCNDG	Hospital	UNKNOWN	NHS Sector	Visible	False	Dmc Community Dermatology Service - Swale CCG (Sittingbourne Memorial Hospital)	Bell Road			Sittingbourne	Kent	ME10 4XX	51.334629058837891	0.73680281639099121	NCN	Dmc Healthcare				
    1521540	NX139	Hospital	Hospital	NHS Sector	Visible	True	Orpington Hospital		Sevenoaks Road				BR6 9JU	51.362503051757813	9.5164142549037933E-2	RJZ	King's College Hospital NHS Foundation Trust	01689 863000			
    1522064	NHM02	Hospital	UNKNOWN	NHS Sector	Visible	True	Aldeburgh Community Hospital	Park Road	Park Road		Aldeburgh	Suffolk	IP15 5ES	52.152133941650391	1.5946410894393921	NHM	Suffolk Community Healthcare				
    1522065	NHM03	Hospital	Hospital	NHS Sector	Visible	True	Bluebird Lodge	100 Mansbrook Boulevard			Ipswich	Suffolk	IP3 9GJ	52.027252197265625	1.1984111070632935	NHM	Suffolk Community Healthcare	01473 322100			
    1634862	NL002	Hospital	UNKNOWN	NHS Sector	Visible	False	Edith Shaw Hospital	5 Hugo Street			Leek	Staffordshire	ST13 5PE	53.102691650390625	-2.0281734466552734	NL0	John Munroe Hospital				
    1634886	NHM05	Hospital	Hospital	Independent Sector	Visible	True	Felixstowe Community Hospital		Constable Road		Felixstowe, Suffolk		IP11 7HJ	51.963764190673828	1.3559541702270508	NHM	Suffolk Community Healthcare	01394 458820			
    1708579	NV1T7	Hospital	Hospital	Independent Sector	Visible	True	Braintree Community Hospital	Braintree Community Hospital	Chadwick Drive		Braintree	Essex	CM7 2AL	51.879871368408203	0.54041993618011475	NV1	Inhealth Group Limited	01376 555920		http://www.inhealthgroup.com/location/braintree-community-hospital	
    1819376	RWNV6	Hospital	UNKNOWN	Independent Sector	Visible	True	Ongar War Memorial	Fyfield Road			Ongar	Essex	CM5 0AL	51.716938018798828	0.24629226326942444	RWN	South Essex Partnership University NHS Foundation Trust				
    1819383	RRPG7	Hospital	Mental Health Hospital	Independent Sector	Visible	False	St Andrews Court	1-4 River Front	Enfield Town		Enfield	Middlesex	EN1 3SY	51.652778625488281	-7.8789718449115753E-2	RRP	Barnet, Enfield and Haringey Mental Health NHS Trust				
    1819387	RN7ED	Hospital	Hospital	NHS Sector	Visible	True	Erith and District Hospital		Park Crescent		Erith	Kent	DA8 3EE	51.47711181640625	0.16665773093700409	RN7	Dartford and Gravesham NHS Trust	01322 356186	generalenquiries@dvh.nhs.uk	http://www.dvh.nhs.uk/about-us/eh/	
    1819725	RF4PP	Hospital	UNKNOWN	Independent Sector	Visible	False	Barking Hospital	Upney Lane			Barking	Essex	IG11 9LX	51.538871765136719	9.8683461546897888E-2	RF4	Barking, Havering and Redbridge University Hospitals NHS Trust				
    1819831	RT5PA	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Melton Mowbray Hospital		Thorpe Road	Melton Mowbray	Leicestershire		LE13 1SJ	52.765937805175781	-0.87728118896484375	RT5	Leicestershire Partnership NHS Trust	01664 854800		http://www.leicspart.nhs.uk/_OurServices-CommunityHospitals-MeltonMowbrayHospital.aspx	
    1819857	RWELC	Hospital	UNKNOWN	Independent Sector	Visible	False	Coalville Community Hospital	Coalville Hospital	Broom Leys Road		Coalville	Leicestershire	LE67 4DE	52.722938537597656	-1.3498764038085937	RWE	University Hospitals Of Leicester NHS Trust				
    1819859	RWELH	Hospital	UNKNOWN	Independent Sector	Visible	False	Hinckley & District Hosp	Mount Road			Hinckley	Leicestershire	LE10 1AG	52.540004730224609	-1.368283748626709	RWE	University Hospitals Of Leicester NHS Trust				
    1819864	RWELS	Hospital	UNKNOWN	Independent Sector	Visible	False	St Lukes Hospital	33 Leicester Road			Market Harborough	Leicestershire	LE16 7BN	52.487213134765625	-0.93109053373336792	RWE	University Hospitals Of Leicester NHS Trust				
    2026442	RW15R	Hospital	UNKNOWN	Independent Sector	Visible	True	Victoria Cottage Hospital	North Street			Emsworth	Hampshire	PO10 7DD	50.848136901855469	-0.93767058849334717	RW1	Southern Health NHS Foundation Trust	01243 376041			
    2026812	RP629	Hospital	UNKNOWN	Independent Sector	Visible	True	Moorfields At Sir Ludwig Guttmann Health And Wellbeing Centre	40 Liberty Bridge Road	East Village	Olympic Park	London	Greater London	E20 1AS	51.548198699951172	-6.1063333414494991E-3	RP6	Moorfields Eye Hospital NHS Foundation Trust				
    2027168	RALC7	Hospital	UNKNOWN	Independent Sector	Visible	True	Chase Farm Hospital	127 The Ridgeway			Enfield	Middlesex	EN2 8JL	51.666313171386719	-0.10362467914819717	RAL	Royal Free London NHS Foundation Trust	020 8375 2999	bcfpals@nhs.net	https://www.royalfree.nhs.uk/	
    2027169	RALC8	Hospital	UNKNOWN	Independent Sector	Visible	False	St Michael's Hospital	Gater Drive			Enfield	Middlesex	EN2 0JB	51.661914825439453	-8.3709865808486938E-2	RAL	Royal Free London NHS Foundation Trust				
    2027176	RV9FH	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Humber Centre for Forensic Psychiatry		Willerby Hill				HU10 6ED	53.770244598388672	-0.44977658987045288	RV9	Humber NHS Foundation Trust	01482 336200	hnf-tr.contactus@nhs.net	http://www.humber.nhs.uk	
    2309133	RTP02	Hospital	UNKNOWN	Independent Sector	Visible	True	Crawley Hospital	West Green Drive			Crawley	West Sussex	RH11 7DH	51.116600036621094	-0.19756022095680237	RTP	Surrey and Sussex Healthcare NHS Trust	01293 600300			
    2309255	TAJ52	Hospital	Hospital	NHS Sector	Visible	True	Penn Hospital	Penn Hospital	Penn Road	Penn	Wolverhampton		WV4 5HN	52.558635711669922	-2.1591582298278809	TAJ	Black Country Partnership NHS Foundation Trust	01902 444141		http://www.bcpft.nhs.uk	
    2309420	RL4TC	Hospital	UNKNOWN	Independent Sector	Visible	True	Cannock Chase Hospital	Brunswick Road			Cannock	Staffordshire	WS11 5XY	52.693244934082031	-2.0305995941162109	RL4	The Royal Wolverhampton NHS Trust	01543 572757			
    2309422	NQ402	Hospital	UNKNOWN	NHS Sector	Visible	False	All Saints Hospital (St George Healthcare Group)	159 Grange Avenue			Oldham	Lancashire	OL8 4EF	53.528518676757812	-2.1274170875549316	NQ4	St George Healthcare Group				
    3775034	RMYMW	Hospital	Mental Health Hospital	NHS Sector	Visible	True	Walker Close		3 and 4 Walker Close		Ipswich	Suffolk	IP3 8LY	52.052719116210937	1.1968756914138794	RMY	Norfolk and Suffolk NHS Foundation Trust	01473 237003		http://www.nsft.nhs.uk	
    3775035	RMY55	Hospital	Mental Health Hospital	NHS Sector	Visible	True	St Catherines Way	Stepping Out	1B St Catherines Way		Gorleston on Sea	Norfolk	NR31 7QB	52.572963714599609	1.7169284820556641	RMY	Norfolk and Suffolk NHS Foundation Trust	01493 444465		http://www.nsft.nhs.uk
""".trimIndent()