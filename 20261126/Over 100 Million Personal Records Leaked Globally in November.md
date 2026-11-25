# Over 100 Million Personal Records Leaked Globally in November

## Who Holds Your Files Matters Far More Than You Think

If you draw a timeline of data security incidents from November 2026, the picture is staggering.

November 11: Over 60,000 email addresses belonging to Japan’s Cabinet Office were leaked, alongside some individuals’ names, genders and occupational details. The same week, unauthorized access hit a Japanese government document-sharing system, putting roughly 240,000 sets of personal data of public servants at risk.

November 12: TSMC confirmed 46,000 employee records, totalling 6.9 GB, had been posted for sale on underground hacker forums. TSMC’s carefully worded statement noted there was “no evidence TSMC’s own systems were breached” — the leak originated from its cloud vendor’s infrastructure.

November 16: Security research firm Report URI warned that 178 organizations worldwide fell victim to website compromise via an Optimizely supply-chain vulnerability. The list includes BBC, CNN, HSBC and Zoom. Attackers injected malicious JavaScript to steal crypto keys, card details and browser data.

November 17: Japanese brokerage Lotte Securities disclosed that up to 15.72 million customer accounts may have been exposed, with leaked fields including names, residential addresses, annual income, financial assets and bank account numbers.

November 20: Korea Electric Power Corporation (KEPCO) confirmed external attacks on its customer portal *Hanjeon ON* and e-procurement platform, leaking around 1.52 million personal records. This marked its second major breach within a month; the earlier incident affected 35,528 internal staff and partners.

This tally does not even include Sagawa Express with 53.23 million records, Korean barbecue chain King of Pork Belly with 10.78 million patrons, and Mr. Max with 1.73 million members.

Within Japan alone, the volume of leaked personal information in 2026 has already surpassed 100 million records.

---

## The Overlooked Term: Supply Chain

Look closely at these incidents and a recurring pattern emerges:
**The company whose data got leaked was often not the one directly hacked.**

TSMC’s own systems were not compromised. Its cloud provider was.
Lotte Securities’ core network stayed intact. Attackers got in through a third-party access point in its test environment.
Those 178 compromised websites were not individually hacked. Exploiters abused a flaw in the shared Optimizely service they all relied on.

This is a **supply-chain attack**. Attackers do not need to storm your fortress; they only need to find a crack in the supply wagon bringing you supplies.

In the cloud era, your files do not live in one single place. They travel across CDN nodes, redundant data-centre backups, API gateways and third-party processors. Every link is part of the supply chain — and every link is a potential breach point.

TSMC’s fabs are among the most secure facilities on Earth. Still, its employee data ended up on the dark web, because the data left TSMC’s physical perimeter and entered a supply chain it could not fully control.

---

## How Long Is Your Personal Supply Chain?

Enterprises at least have IT teams, security budgets and vendor contracts to impose rules.

What about ordinary users?

Photos on your phone auto-sync to cloud drives. Work documents sit in online office suites. Scanned contracts, ID photos and bank statements are scattered across several cloud services. Your passwords live in a password manager. Chat history rests on messaging servers.

All of these are your service providers. And those providers have vendors of their own: underlying infrastructure may run on AWS, Azure or Alibaba Cloud; AI features may call third-party LLM APIs; backups may be replicated across geographically separated data centres.

This is an invisible, ungoverned supply chain you may never even know exists.

Your most sensitive assets — identity documents, financial records, family photos, business secrets — drift silently along this chain.

---

## The Paradox of Cloud Storage: Convenience Comes With Visibility

Modern cloud storage is built for invisibility: auto-sync, instant access, cross-device sharing, smart search. You never need to wonder where your files are stored; open the app and everything is there.

But this seamless experience has a trade-off: your data must also be visible to the service provider.

To sort photos automatically, the provider needs to see your images. To run full-text search, it needs to read your documents. To deduplicate files and cut storage costs, it needs to inspect every upload.

On the provider’s servers, your data exists as readable plaintext.

That means if any link in the supply chain breaks — your direct provider, their subcontractor, or even a subcontractor further down the line — your data becomes a package ready for attackers to steal.

The 15.72 million Lotte Securities users, 1.52 million KEPCO customers and 46,000 TSMC employees did nothing wrong. They trusted one link in that chain. And that link failed.

---

## An Alternative: Store Your Data Without Surrendering Control

The root issue is not cloud storage itself. It is an overlong trust chain.

One solution is shortening that chain: keep sensitive data where you can control it — local devices, private storage, end-to-end encrypted channels.

DoraCloud follows this design philosophy. It stores both private sensitive data and ordinary files, with one core rule: **data sovereignty belongs to the user, not the platform**. Its storage architecture uses isolated tiers, separating sensitive private data from regular files onto distinct storage paths. All transmission runs over end-to-end encrypted channels; the server never parses or indexes file content. You retain full control over your data, including who may access it, how, and for how long.

This is not simply a pitch that it outperforms iCloud or undercuts Google Drive on price. It is about **setting clear trust boundaries**.

When you upload files to DoraCloud, the platform does not need to read their contents to deliver features. Smart search and automatic classification run locally on your client device, instead of feeding your private files into server-side AI models.

Convenience and privacy do not have to be an either-or choice.

---

## Closing Note: This Is Not Fearmongering — It Is Reality

November 2026 is not over yet.

China’s Ministry of Industry and Information Technology recently released its seventh list of non-compliant apps and SDKs, naming 23 services for intrusive pop-ups and unclosable redirects. A separate third notice flagged 46 apps abused by criminals for telecom fraud.

One hundred and seventy-two countries have enacted data protection laws. China’s 2026 special campaign for personal information protection continues to ramp up enforcement. The policy signal is unambiguous: data protection is not optional; it is a baseline requirement.

Yet legislation can only regulate corporate conduct. It cannot outrun hackers, who always move faster than compliance patches.

TSMC, Lotte Securities, KEPCO, BBC, CNN, HSBC — these are household names with large security budgets and expert engineering teams. Still, their data leaked in November. Not from a frontal breach, but through a crack in the supply chain.

You cannot gamble on every third-party vendor staying secure. Before handing over your files, pause and ask one question:

**Does this service truly need to see everything inside my files?**