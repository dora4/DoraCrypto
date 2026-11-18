# That contract in your cloud drive was “forwarded” by the BBC, HSBC and Zoom just yesterday

## — A look at the Optimizely supply-chain attack: how many unseen hands have touched your files?

You might have missed yesterday’s news.

Report URI, a cybersecurity research firm, released an advisory: websites belonging to 178 major global organisations fell victim to a supply-chain attack. The list includes the BBC, CNN, HSBC, Zoom, GitLab, IKEA, Bloomberg, Alaska Airlines, Levi’s… It reads like a roll call from the Forbes list of global brands.

The attackers did not hack the BBC’s servers or breach HSBC’s firewalls. Instead, they targeted an intermediary: Optimizely, a tech vendor that provides “personalisation experience” services for websites. Countless major companies embed Optimizely scripts on their web pages to run A/B tests and analyse user behaviour.

The attackers injected malicious code into these scripts.

The outcome? **Every visitor to any site running that script was compromised without their knowledge.**
The malware stole crypto wallet credentials, card data and browser-saved passwords. A dedicated iOS malicious program was also deployed targeting iPhone users.

Readers of the BBC, HSBC customers, Zoom users — their data was not stolen directly from the servers of the BBC, HSBC or Zoom. It was intercepted by an intermediary service provider they had never even heard of.

**You think you hand your data over to one brand. In reality, it passes through countless middlemen whose names you will never know.**

---

## A question you may never have considered

Is your cloud drive working well?

Most people would say “it’s okay”. Fast syncing, generous storage, cross-device access, and occasionally AI that helps search and summarise files.

But have you ever wondered: **what intermediaries handle your file as it travels from your phone to the cloud?**

Most people cannot answer this. It is not a lack of smarts; cloud providers simply never tell you.

A file travelling from your device to its final storage location may go through these stages:

- Your cloud drive app processes the file locally (compression, formatting, thumbnail generation)
- The file is sent over Wi‑Fi or cellular data to your carrier’s gateway
- The data is routed through CDN (Content Delivery Network) nodes
- The file reaches the cloud provider’s front-end receiving servers
- The data is distributed to the actual storage cluster
- If AI features are enabled, the file may be sent to an AI processing service for analysis

This does not even account for backups, synchronisation, cross-region replication and other follow-up workflows.

**From your hands to its final resting place, a single file may pass through five, six or more parties. Each party touches your data at some stage — even if only briefly in transit.**

The Optimizely breach illustrates this: intermediaries are the weakest link. The brand itself may be secure, and the final storage destination may be secure — but the route your data travels every single day can be the most vulnerable point.

---

## Your contract was not “stolen” — it was “seen”

Let’s reframe this.

Supply-chain attacks are malicious: attackers deliberately inject rogue code to steal data. But in everyday use, your files are also accessed by intermediaries — just not with hostile intent.

It simply happens, as part of the system.

Suppose you store a rental contract on your cloud drive. It has your full name, ID number, monthly rent and your landlord’s bank account details. As the file syncs via the cloud service, it passes through CDN nodes. The operator of that CDN, usually a separate company, gains momentary access to the contract content.

If the connection uses encryption (HTTPS), the CDN node should in theory only see ciphertext. But under many cloud drive architectures, data passes through the CDN in plaintext — because the CDN needs to decrypt content for caching optimisation, compression and acceleration.

When your AI assistant “organises your folders”, it has to read file contents. If files are unencrypted, the AI system sees everything inside. While sorting your files, it also “learns” from your data.

**This is not theft. It is lawful access. Yet the end result is the same: sensitive information of yours is viewed by people or systems that ought not to see it.**

The BBC did not know the Optimizely script had been compromised. HSBC had no idea visitor data was being siphoned off. Similarly, you can never know whether, for those few milliseconds your contract sits on a CDN node, something takes a peek.

---

## Counterintuitive truth: the more files you store, the higher your risk

How many files do you keep on your cloud drive?

I have asked several friends; answers range from a few hundred to tens of thousands. Photos, videos, work documents, scans, screenshots, e-books, installers… Over time, cloud storage becomes a dumping ground for everything digital.

The problem is this: **you cannot apply the same level of protection to every single file.** You would not lock a grocery receipt and a bank statement in the same safe.

Yet for most users, ID photos sit alongside travel vlogs in the same “Photos” folder. Rental contracts are mixed with screenshots of takeaway coupons. Bank statement screenshots share the same “Documents” directory as your child’s school reports.

**Everything uses the same transmission channel, the same encryption scheme and the same access permissions.**

What does this mean? If an attacker gains access to your cloud data — via a hack, an internal leak, or under the provider’s terms of service — they do not need to hunt around. Your sensitive files sit right beside ordinary files, ready to be taken in one bulk grab.

The more files you accumulate, the greater the chance sensitive records get mixed in with routine files. If the whole repository is compromised, attackers harvest far more valuable data. The richer your digital life, the greater your exposure.

---

## DoraCloud’s approach: not “a better lock”, but “two separate rooms”

DoraCloud is not designed merely to be “a more secure cloud drive”. The root issue is not whether the cloud drive itself is safe — it is that you keep everything together in one place.

Its core feature is simple: **partitioning.**

**General File Zone.**
Photos, videos, documents, slides, work materials. Fast sync pathways, instant opening across devices, full AI support for sorting and search. The experience matches mainstream cloud drives.

**Privacy Zone.**
Identity documents, contracts, financial records, medical files, password notes. This zone uses end-to-end encryption: files are encrypted on your device *before upload*. Only you hold the decryption keys. The server only stores ciphertext.

A cryptographic barrier separates the two zones. This is not a toggleable admin permission setting, nor just a privacy-policy promise of non-disclosure. It is mathematical isolation. To everyone — including the DoraCloud team — the ciphertext on the server is meaningless noise.

Back to the supply-chain attack scenario: if your contract lives inside the Privacy Zone, even if an intermediate transit node is hacked, attackers will only intercept encrypted data. Ciphertext is worthless. It protects you.

---

## Why your AI assistant cannot enter the Privacy Zone

DoraCloud lets AI work freely inside the General File Zone. It can help you locate a photo from last year, summarise a work document, or transcribe meeting recordings.

But the Privacy Zone stays off-limits to AI.

This is not a technical limitation — it is an intentional design choice. AI assistants need to read file content to function. If they could parse your contracts and medical reports, they would lay eyes on your most sensitive data. And that visibility itself creates risk. Even if the AI does not leak data deliberately, its training pipelines, backend services and third-party integrations all become potential leakage paths.

DoraCloud’s design principle: **AI serves you within safe bounds, while your most sensitive data never enters any AI processing workflow.**

Your AI helper can tidy the living room for you. But it cannot, and need not, see what sits inside the safe in your bedroom.

---

## One thing you can do today

No downloads required. No sign-ups needed.

Open your current cloud drive and browse your file list. Look for items such as:

- Scanned ID cards or passports
- Screenshots or files relating to bank cards
- Contracts of all kinds (tenancy, employment, loans)
- Medical test reports and health records
- Password notes and account credentials

Where are these files? Mixed in with everyday files?

Imagine your cloud account gets compromised one day — or more stealthily, one link in your cloud provider’s supply chain suffers a supply-chain attack. Could all these files be seized at once?

**You do not have to act right away. But you need to understand this risk.**

The Optimizely incident proves that even when a brand you trust is solid, your data can be seen by unauthorised parties while in transit.

DoraCloud’s mission is straightforward: **keep your most important files off that shared public pathway from the start.**

They travel along their own encrypted channel straight from your device to storage. No one passing through can sneak a glance.

---

## Lessons from supply-chain attacks

The most unsettling part of the Optimizely incident was not that 178 websites were compromised.

It was that **the operators of those sites had no idea their users’ data was being intercepted.** The BBC, HSBC and Zoom all have strong security teams. Yet none could block malicious code injected into a third-party script.

Your cloud provider may also run a capable security team. But your files do not merely sit on its servers — they are constantly on the move: syncing, transmitting, sent for AI processing.

**Security in transit is harder to guarantee, and far easier to overlook, than security at rest.**

DoraCloud builds a dedicated lane for your sensitive files. This lane starts on your device, stays encrypted end-to-end, and runs straight to storage. No bystanders along the way.

It is not that other pathways are guaranteed to be watched. It is that **some things are simply not worth the risk.**

---

*DoraCloud — separate management for private data and regular files, end-to-end encryption, platform holds no decryption keys.*